package com.example.javapythonapp.controller;

import com.example.javapythonapp.service.PythonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class SimpleController {

    private final PythonService pythonService;

    @GetMapping("/")
    public String response() throws IOException {
        return pythonService.response();
    }

    @GetMapping("/info")
    public String info() {
        return "This is basic prototype";
    }
}
