import com.example.Feline;
import com.example.Lion;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionTestParameterized extends TestCase {

    private final String sex;
    private final boolean hasMane;
    Feline feline;

    public LionTestParameterized(String sex, boolean hasMane){
        this.hasMane = hasMane;
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getHasMane(){
      return new Object[][] {
              {"Самец", true},
              {"Самка", false}
      };
    }

    @Test
    public void newLionHasManeOrNot() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean expected = lion.hasMane;
        assertEquals(this.hasMane, expected);
    }
}


