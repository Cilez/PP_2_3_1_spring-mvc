package web.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsList {
    List<Car> list = new ArrayList<>();

    {
        list.add(new Car("Toyota","Seul",1234));
        list.add(new Car("Nisan","Seul",1234));
        list.add(new Car("Cheroki","Seul",1234));
        list.add(new Car("Compacy","Seul",1234));
        list.add(new Car("Foo","Seul",1234));
    }

    public CarsList() {
    }

    public List<Car> getList() {
        return list;
    }

    public void setList(List<Car> list) {
        this.list = list;
    }

    public void add(Car car) {
        list.add(car);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public Car getCarById(int id) {
        return list.get(id);
    }
}
