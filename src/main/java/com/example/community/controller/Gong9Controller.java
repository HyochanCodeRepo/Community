package com.example.community.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
@RequiredArgsConstructor
public class Gong9Controller {

    @GetMapping("/gong9")
    public String gong9(){

        return "gong9";
    }
}
