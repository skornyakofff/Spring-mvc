package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

@Controller
@RequestMapping(value = "/cars")
public class CarsController {
    @Autowired
    CarsService carsService;

    @GetMapping()
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        model.addAttribute("cars", carsService.getCars(count));
        return "cars";
    }
}
