package com.github.rsoi;

import com.github.rsoi.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootConsoleApplication implements CommandLineRunner {

    private final MainService mainService;

    public static void main(String[] args) {

        SpringApplication.run(SpringBootConsoleApplication.class, args);

	}

    @Override
    public void run(String... args) {
        mainService.runMainProgram();
    }
}
