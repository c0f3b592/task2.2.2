package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    private CarService carService;

    public CarsController() {}

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model, @RequestParam(defaultValue = "5",required = false) int count) {
        model.addAttribute("cars_info",carService.getCars(count));
        return "cars";
    }

}