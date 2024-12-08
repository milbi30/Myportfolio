package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    //기본페이지 요청 메서드
    @GetMapping("/")
    public String index(){
        return "index"; // => templates 폴더의 html을 찾아감
    }
}
