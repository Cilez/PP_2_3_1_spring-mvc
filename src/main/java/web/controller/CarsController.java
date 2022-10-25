package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printWelcomeCars(ModelMap model) {
        List<Car> messages = new ArrayList<>();
        messages.add(new Car("Toyota","Seul",1234));
        messages.add(new Car("Nisan","Seul",1234));
        messages.add(new Car("Cheroki","Seul",1234));
        messages.add(new Car("Compacy","Seul",1234));
        messages.add(new Car("Foo","Seul",1234));
        model.addAttribute("messages", messages);
        return "index";
    }
}
