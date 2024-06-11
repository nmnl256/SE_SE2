package test.java;
import static org.junit.jupiter.api.Assertions.*;
import main.java.Main;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.Scanner;
public class testofWork {
    @Test
    public void test_min() throws Exception
    {
        File file = new File("src/test/tests/test1.txt");
        String[] numbers = (new Scanner(file)).nextLine().split(" ");
        int[] intnums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
        {
            intnums[i] = Integer.parseInt(numbers[i]);
        }
        assertEquals(1, Main._min(intnums));
    }
    @Test
    public void test_max() throws Exception
    {
        File file = new File("src/test/tests/test2.txt");
        String[] numbers = (new Scanner(file)).nextLine().split(" ");
        int[] intnums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
        {
            intnums[i] = Integer.parseInt(numbers[i]);
        }
        assertEquals(8, Main._max(intnums));
    }
    @Test
    public void test_sum() throws Exception
    {
        File file = new File("src/test/tests/test3.txt");
        String[] numbers = (new Scanner(file)).nextLine().split(" ");
        int[] intnums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
        {
            intnums[i] = Integer.parseInt(numbers[i]);
        }
        assertEquals(152, Main._sum(intnums));
    }
    @Test
    public void test_mult() throws Exception
    {
        File file = new File("src/test/tests/test4.txt");
        String[] numbers = (new Scanner(file)).nextLine().split(" ");
        int[] intnums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
        {
            intnums[i] = Integer.parseInt(numbers[i]);
        }
        assertEquals(1185098, Main._mult(intnums));

    }
}
