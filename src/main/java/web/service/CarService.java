package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService implements CarServiceInt{
    public List<Car> getCarList(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "White", 3.5));
        cars.add(new Car("Toyota", "Black", 2.5));
        cars.add(new Car("BMW", "Yellow", 2.8));
        cars.add(new Car("Mercedes-Benz", "Blue", 3.2));
        cars.add(new Car("Audi", "Red", 2.8));
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
