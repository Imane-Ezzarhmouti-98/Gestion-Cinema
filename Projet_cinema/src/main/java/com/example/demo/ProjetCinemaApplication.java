package com.example.demo;

import com.example.demo.sid.ICinemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetCinemaApplication implements CommandLineRunner {

    @Autowired
    private ICinemaInitService initService;

    public static void main(String[] args) {
        SpringApplication.run(ProjetCinemaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        initService.initVilles();
        initService.initCinemas();
        initService.initSalles();
        initService.initPlaces();
        initService.initSeances();
        initService.initGategories();
        initService.initFilms();
        initService.initProjections();
        initService.initTickets();
    }
}
