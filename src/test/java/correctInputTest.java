package test.java;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

public class correctInputTest
{
    @Test
    public void inputTest() throws Exception
    {
        File file = new File("src/test/tests/wrongtest.txt");
        String input = (new Scanner(file)).nextLine();
        String[] nums = input.split(" ");
        boolean flag = false;
        for (char ch : String.join("", nums).toCharArray())
        {
            if (!Character.isDigit((ch)))
            {

                flag = true;
            }
        }
        assertTrue(flag);
        System.out.println("Файл не содержит символов/программа работает неккоректно");
    }
}
