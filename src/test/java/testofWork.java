package test.java;
import static org.junit.jupiter.api.Assertions.*;
import main.java.Main;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class testofWork {

    @Test
    public void Test_min() throws FileNotFoundException
    {
        File file = new File("src/test/tests/test1.txt");

        String input = (new Scanner(file)).nextLine();


        String[] numbers = input.split(" ");
        int[] intnums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
        {
            intnums[i] = Integer.parseInt(numbers[i]);
        }
        assertEquals(1, Main._min(intnums));
    }
    @Test
    public void Test_max() throws FileNotFoundException
    {
        File file = new File("src/test/tests/test2.txt");

        String input = (new Scanner(file)).nextLine();


        String[] numbers = input.split(" ");
        int[] intnums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
        {
            intnums[i] = Integer.parseInt(numbers[i]);
        }
        assertEquals(8, Main._max(intnums));
    }
    @Test
    public void Test_sum() throws FileNotFoundException
    {
        File file = new File("src/test/tests/test3.txt");

        String input = (new Scanner(file)).nextLine();


        String[] numbers = input.split(" ");
        int[] intnums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
        {
            intnums[i] = Integer.parseInt(numbers[i]);
        }
        assertEquals(152, Main._sum(intnums));
    }
    @Test
    public void Test_mult() throws FileNotFoundException
    {
        File file = new File("src/test/tests/test4.txt");

        String input = (new Scanner(file)).nextLine();


        String[] numbers = input.split(" ");
        int[] intnums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
        {
            intnums[i] = Integer.parseInt(numbers[i]);
        }
        assertEquals(1185098, Main._mult(intnums));

    }
}
