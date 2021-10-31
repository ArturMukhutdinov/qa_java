package com.example;

import com.example.Animal;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest extends TestCase {


    @Test
    public void testGetFoodThanAnimalIsPredator() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(("Хищник"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(actual, expected);
    }

    @Test
    public void testGetFoodThanAnimalIsHerbivorous() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(("Травоядное"));
        List<String> expected = List.of("Трава", "Различные растения");
        assertEquals(actual, expected);
    }

    @Test(expected = Exception.class)
    public void testUnknownAnimal() throws Exception {
            Animal animal = new Animal();
            animal.getFood("");
    }

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
       assertEquals(animal.getFamily(), "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи");
    }
}