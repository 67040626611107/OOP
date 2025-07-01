import javax.swing.*;
import java.util.*;

public class n2 {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter fahrenheit : ");
        double Fahrenheit = input.nextDouble();
        double Celcius = ( ( Fahrenheit - 32 )  * 5) / 9;
        System.out.println(Celcius);
    }
}
