package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getFirst(int count);

    List<Car> getAll();
}
