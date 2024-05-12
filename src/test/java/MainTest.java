import static org.junit.Assert.*;

import org.junit.*;
import java.util.*;
import com.example.Main;

public class MainTest {
    private List<Integer> testNumbers;
    private List<Integer> largeNumbers;

    @Test
    public void testMin() {
        testNumbers = Arrays.asList(1, 4, 2, 3);

        assertEquals(1, Main.min(testNumbers));
    }

    @Test
    public void testMax() {
        testNumbers = Arrays.asList(1, 4, 2, 3);

        assertEquals(4, Main.max(testNumbers));
    }

    @Test
    public void testSum() {
        testNumbers = Arrays.asList(1, 4, 2, 3);

        assertEquals(10, Main.sum(testNumbers));
    }

    @Test
    public void testMult() {
        testNumbers = Arrays.asList(1, 4, 2, 3);

        assertEquals(24, Main.mult(testNumbers));
    }

    @Test
    public void testPerformance() {
        List<Integer> largeNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 1000000; i++) {
            int randomNum = random.nextInt(1000000);
            largeNumbers.add(randomNum);
        }

        long startTime = System.currentTimeMillis();

        Main.sum(largeNumbers);
        Main.mult(largeNumbers);
        Main.min(largeNumbers);
        Main.max(largeNumbers);

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;


        assertTrue(duration < 5000);
    }

    @Test
    public void testNegative() {
        List<Integer> numbers = List.of(-1, -2, -3, 4);
        assertEquals(-24, Main.mult(numbers));
    }
}
