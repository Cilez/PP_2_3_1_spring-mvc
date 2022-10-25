package web.service;

import web.models.Car;
import web.models.CarsList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CarServiceImpl implements CarService {

    CarsList list = new CarsList();
    @Override
    public List<Car> getCars(int amount) {
        List<Car> cars = new LinkedList<>();
        for(int i = 0; i < amount; i++) {
            cars.add(list.getCar(i));
        }
        return cars;
    }
}
