import javax.swing.*;
import java.util.*;
public class n5 {
    static Scanner Input = new Scanner(System.in);
    public static void main(String arg[]) {
        System.out.print("Enter balance and Interest rate (e.g , 3  for 3%)");
        double balance = Input.nextDouble();
        double annualInterestRate = Input.nextDouble();
        double interest = balance * (annualInterestRate / 1200);
        System.out.println(String.format("The interest is %.6f",interest) );
    }
}
