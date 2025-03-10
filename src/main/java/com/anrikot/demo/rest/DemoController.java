package com.anrikot.demo.rest;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
    
    @GetMapping("/")
    public String getTemplate(Model model) {
        model.addAttribute("noctchillIdols",
                Arrays.asList(
                    "Higuchi Madoka",
                    "Koito Fukumaru",
                    "Hinana Ichikawa",
                    "Asakura Toru"
                    ));

        return "index";
    }
}
