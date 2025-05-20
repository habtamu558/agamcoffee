package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {


    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "Hello world, in my first Spring controller.");
        return "home";
    }


    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name = "name", required = false, defaultValue = "agam") String name,
            Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
