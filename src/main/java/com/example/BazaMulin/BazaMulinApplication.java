package com.example.BazaMulin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class BazaMulinApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(BazaMulinApplication.class, args);
        ProcessBuilder pb = new ProcessBuilder("explorer", "http://localhost:9090");
        pb.start();
    }
}
