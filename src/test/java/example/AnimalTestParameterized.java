package example;
import com.example.Animal;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTestParameterized extends TestCase {
    private final String animalKind;
    private final List<String> foodList;

    public AnimalTestParameterized(String animalKind, List<String> foodList){
        this.animalKind = animalKind;
        this.foodList = foodList;
    }

    @Parameterized.Parameters
    public static Object[][] getFoodList(){
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения") },
                {"Хищник", List.of("Животные", "Птицы", "Рыба") }
        };
    }

    @Test
    public void bothTypesOfAnimalsHaveTheirOwnFoodList() throws Exception {
        Animal animal = new Animal();
        List<String> expected = animal.getFood(animalKind);
        assertEquals(this.foodList, expected);
    }
}
