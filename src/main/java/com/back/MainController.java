package com.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String root() {
        return "redirect:/question/list"; //서비스 활용하기 부터 시작하면됨
    }
}
