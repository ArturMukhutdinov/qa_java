package example;

import com.example.Feline;
import com.example.Lion;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest extends TestCase {

    @Mock
    Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец",feline);
        Mockito.when(feline.getKittens()).thenReturn(3);
        int expected = lion.getKittens();
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void testDoesHaveManeMaleTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue("Должна быть гривы", lion.doesHaveMane());
    }

    @Test
    public void testDoesNotHaveManeFemaleTrue() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse("Не должно быть гривы", lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void testDoesHaveManeWrongSexTrue() throws Exception {
        Lion lion = new Lion("", feline);

    }

    @Test
    public void testGetFoodLionEatMeatTrue() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец", feline);
        List<String> expected = feline.getFood("Хищник");
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);

    }
}