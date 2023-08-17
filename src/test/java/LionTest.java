import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final int countKittens = 5;
    private final List<String> food = Arrays.asList("Животные", "Птицы", "Рыба");

    @Mock
    Feline feline = new Feline();

    @Test
    public void getKittensTest() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(countKittens);
        Lion lion = new Lion("Самка", feline);
        Assert.assertEquals(countKittens, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(food);
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(food, lion.getFood());
    }

    @Test
    public void doesHaveManeExceptionTest() {
        try {
            Lion lion = new Lion("Неизвестно", feline);
        } catch (Exception exception) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }
}