package test.java;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;
public class correctInputTest
{
    @Test
    public void test() throws FileNotFoundException
    {
        File file = new File("src/test/tests/test1.txt");
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
        assertEquals(flag, false);
    }
}
