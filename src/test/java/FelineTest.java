import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    Feline feline = new Feline();
    private final int kittensCount = 5;

    @Test
    public void eatMeatTest() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensDefaultTest() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensCountTest() {
        Assert.assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}