package com.example.tp13;

import com.example.tp13.entities.Compte;
import com.example.tp13.entities.TypeCompte;
import com.example.tp13.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Tp13Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp13Application.class, args);
    }

}
