package com.example;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.Random;

@Named
@RequestScoped
public class RandomNumberBean {
    private int randomNumber;

    public int getRandomNumber() {
        return randomNumber;
    }

    public void generateRandomNumber() {
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100
    }
}
