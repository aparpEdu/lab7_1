package com.example.yup.generator;

import com.example.yup.model.Fruit;
import com.example.yup.model.Vegetable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    public static List<Vegetable> generate(int size) {
        List<Vegetable> vegetables = new ArrayList<>();
        Random random =  new Random();
        for(int i = 0; i<size; i++) {
            vegetables.add(new Vegetable("Vegetable"+ i, Math.round(random.nextDouble() * 100.0) / 100.0, random.nextInt(100)));
            vegetables.add(new Fruit("Fruit" + i, Math.round(random.nextDouble() * 100.0) / 100.0, random.nextInt(100), random.nextInt(100)));
        }
        return vegetables;
    }
}

