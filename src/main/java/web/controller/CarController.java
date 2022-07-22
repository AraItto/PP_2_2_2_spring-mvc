package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsCountService;


@Controller
public class CarController {

    private CarsCountService carsCountService;

    @Autowired
    public CarController(CarsCountService carsCountService) {
        this.carsCountService = carsCountService;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carsCountService.getCarsByCount(count));
        return "cars";
    }
}