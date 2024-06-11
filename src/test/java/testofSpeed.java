package test.java;
import main.java.Main;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.Scanner;
public class testofSpeed {
    double startTime;
    double endTime;
    double time;
    public void calculate_time(int[] nums)
    {
        int n = nums.length;

        startTime = System.nanoTime();
        Main._min(nums);
        endTime = System.nanoTime();
        time = (endTime - startTime)/1000000;
        System.out.println("Время выполнения min на " + n + " элементов: " + time + " ms");

        startTime = System.nanoTime();
        Main._max(nums);
        endTime = System.nanoTime();
        time = (endTime - startTime)/1000000;
        System.out.println("Время выполнения max на " + n + " элементов: " + time + " ms");

        startTime = System.nanoTime();
        Main._sum(nums);
        endTime = System.nanoTime();
        time = (endTime - startTime)/1000000;
        System.out.println("Время выполнения sum на " + n + " элементов: " + time + " ms");

        startTime = System.nanoTime();
        Main._mult(nums);
        endTime = System.nanoTime();
        time = (endTime - startTime)/1000000;
        System.out.println("Время выполнения mult на " + n + " элементов: " + time + " ms");
    }
    @Test
    public void speedtest1() throws Exception
    {
        File file = new File("src/test/tests/speedtest1.txt");
        String[] numbers = (new Scanner(file)).nextLine().split(" ");
        int[] intnums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
        {
            intnums[i] = Integer.parseInt(numbers[i]);
        }
        calculate_time(intnums);
    }
    @Test
    public void speedtest2() throws Exception
    {
        File file = new File("src/test/tests/speedtest2.txt");
        String[] numbers = (new Scanner(file)).nextLine().split(" ");
        int[] intnums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
        {
            intnums[i] = Integer.parseInt(numbers[i]);
        }
        calculate_time(intnums);
    }
    @Test
    public void speedtest3() throws Exception
    {
        File file = new File("src/test/tests/speedtest3.txt");
        String[] numbers = (new Scanner(file)).nextLine().split(" ");
        int[] intnums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
        {
            intnums[i] = Integer.parseInt(numbers[i]);
        }
        calculate_time(intnums);

    }
    @Test
    public void speedtest4() throws Exception
    {
        File file = new File("src/test/tests/speedtest4.txt");
        String[] numbers = (new Scanner(file)).nextLine().split(" ");
        int[] intnums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
        {
            intnums[i] = Integer.parseInt(numbers[i]);
        }
        calculate_time(intnums);
    }
}
