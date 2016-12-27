package f1db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DriverController {

    @RequestMapping("/")
    public String defaultSivu() {
        return "base";
    }
}
