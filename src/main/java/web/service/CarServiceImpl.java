package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    private final List<Car> carList = Arrays.asList(
            new Car("Toyota Camry", "Black", 2018),
            new Car("Honda Civic", "White", 2020),
            new Car("Ford Focus", "Red", 2016),
            new Car("BMW 3 Series", "Blue", 2019),
            new Car("Audi A4", "Grey", 2021)
    );

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }

}
