package com.mongoapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <b>Proyect: mongoapi</b><br>
 * File: Application.java<br>
 * Date: 05/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(com.mongoapi.Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("deployed and running");
    }
}
