package com.example.javapythonapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class PythonService {

    @Value(value = "${python.script.path}")
    private String filepath;

    private final String PYTHON = "python";

    public String response() throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command(PYTHON, filepath);
        Process process = processBuilder.start();
        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        StringBuilder output = new StringBuilder();
        while ((line = in.readLine()) != null) {
            output.append(line);
        }
        in.close();
        return output.toString();
    }
}
