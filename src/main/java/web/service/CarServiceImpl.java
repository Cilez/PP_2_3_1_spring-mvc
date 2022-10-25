package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.models.Car;
import web.models.CarsList;

import java.util.LinkedList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    CarsList list;
    @Override
    public List<Car> getFirst(int amount) {
        List<Car> cars = new LinkedList<>();
        for(int i = 0; i < amount; i++) {
            cars.add(list.getCarById(i));
        }
        return cars;
    }

    @Override
    public List<Car> getAll() {
        return list.getList();
    }
}
