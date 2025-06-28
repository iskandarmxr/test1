package com.example.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class QRController {

    @GetMapping("/")
    public String home(Model model) {
        return "scanner";
    }
}
