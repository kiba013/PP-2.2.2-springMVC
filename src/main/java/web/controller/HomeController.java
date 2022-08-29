package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;


@Controller
public class HomeController {
    @GetMapping()
    public String getMainPage() {
        return "index";
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count,
                          Model model) {
        model.addAttribute("car", new CarServiceImp().getCarList(count));
        return "car";
    }
}
