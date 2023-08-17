import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionHasManeTest {
    private final String sex;
    private final boolean isHasMane;
    Feline feline = new Feline();

    public LionHasManeTest(String sex, boolean isHasMane) {
        this.sex = sex;
        this.isHasMane = isHasMane;
    }

    @Parameterized.Parameters()
    public static Object[][] getParam() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(isHasMane, lion.doesHaveMane());
    }
}