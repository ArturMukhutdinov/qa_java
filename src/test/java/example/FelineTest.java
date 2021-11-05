package example;

import com.example.Animal;
import com.example.Feline;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest extends TestCase {

    @Mock
    Animal animal;

    @Test
    public void testEatMeat() throws Exception {
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Feline feline = new Feline();
        List<String> actual = animal.getFood("Хищник");
        List<String> expected = feline.eatMeat();
        assertEquals(actual, expected);
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals(actual, "Кошачьи");
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        assertEquals(feline.getKittens(2), 2);
    }

    @Test
    public void testTestGetKittensCount() {
        Feline feline = new Feline();
        int actual = feline.getKittens(3);
        int expected = feline.getKittens();
        assertEquals(actual, expected);
    }
}