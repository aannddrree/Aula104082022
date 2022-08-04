import java.io.IOException;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        System.out.flush();
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        if (idade >= 18)
            System.out.println("Maior de idade");
        else
            System.out.println("Menor de idade");


        clearConsole();

    }

    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
}
