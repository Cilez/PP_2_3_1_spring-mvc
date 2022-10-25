package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.models.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private CarService dao;

    @GetMapping(value = "/cars")
    public String printWelcomeCars(ModelMap model) {
        model.addAttribute("messages", dao.getAll()
                .stream()
                .forEach()
        );
        return "index";
    }

    @GetMapping("/{count}")
    public String show(@PathVariable("count") int c, ModelMap model) {
        model.addAttribute("messages",  dao.getFirst(c));
        return "index";
    }

    @Autowired
    public void setDao(CarService dao) {
        this.dao = dao;
    }
}
