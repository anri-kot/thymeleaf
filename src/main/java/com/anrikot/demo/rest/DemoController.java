package com.anrikot.demo.rest;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
    
    @GetMapping("/")
    public String getTemplate(@RequestParam(name = "name", required = false) String name, Model model) {
        model.addAttribute("noctchillIdols",
                Arrays.asList(
                    "Higuchi Madoka",
                    "Koito Fukumaru",
                    "Hinana Ichikawa",
                    "Asakura Toru"
                    ));
        model.addAttribute("name", name);

        return "index";
    }
}
