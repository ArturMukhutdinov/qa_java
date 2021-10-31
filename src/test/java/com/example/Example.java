package com.example;

import com.example.Cat;
import com.example.Feline;
import com.example.Lion;

public class Example {
        public static void main(String[] args) throws Exception {
    Feline feline = new Feline();
    Lion lion1 = new Lion("Самец", feline);
    Lion lion2 = new Lion("Самка", feline);
    Cat cat = new Cat(feline);

        System.out.println("Котята " + lion1.getKittens());
        System.out.println("Есть ли грива " + lion2.doesHaveMane());
        System.out.println("Есть ли грива у самца " + lion1.doesHaveMane());
        System.out.println("Есть ли грива у самки " + lion2.doesHaveMane());
        System.out.println("Чем питается " + lion2.getFood());

            System.out.println("Семейство " + feline.getFamily());
            System.out.println("Чем питается " + feline.eatMeat());
            System.out.println("Котята " + feline.getKittens());

            System.out.println("Голос " + cat.getSound());
            System.out.println("Чем питается " + cat.getFood());
    }
}

