package main.java;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("src/test/tests/test3.txt");

        String input = (new Scanner(file)).nextLine();


        String[] numbers = input.split(" ");
        int[] intnums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
        {
            intnums[i] = Integer.parseInt(numbers[i]);
        }

        System.out.println("Минимальное" + " " + _min(intnums));
        System.out.println("Максимальное" + " " + _max(intnums));
        System.out.println("Сумма" + " " + _sum(intnums));
        System.out.println("Произведение" + " " + _mult(intnums));
    }
    public static int _max(int[] input)
    {
        int max = -2147483648;
        for (int i = 0; i < input.length; i++)
        {
            if (input[i] > max)
            {
                max = input[i];
            }
        }
        return max;
    }
    public static int _min(int[] input)
    {  int min = 2147483647;
        for (int i = 0; i < input.length; i++)
        {
            if (input[i] < min)
            {
                min = input[i];
            }
        }
        return min;
    }
    public static long _sum(int[] input)
    {
        long result = 0;
        for (int i = 0; i<input.length; i++)
        {
            result+=input[i];
        }
        return result;
    }
    public static long _mult(int[] input)
    {
        long mult = 1;
        for (int i = 0; i < input.length; i++) {
            mult *= input[i];
        }
        return mult;
    }
}
