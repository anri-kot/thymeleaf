package com.anrikot.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
    
    @GetMapping()
        public String getTemplate(@RequestParam(name = "name", required = false, defaultValue = "Producer") String name, Model model) {
            model.addAttribute("name", name);

        return "thymeleafTemplate";
    }
}
