import javax.swing.*;
import java.util.*;
public class n3 {   
    static Scanner Input =  new Scanner(System.in);

    public static void main(String arg[]) {
        System.out.print("Enter monthly saving amount : ");
        double saving = Input.nextDouble();
        double interest  = ( 1 + 0.00417);
        double sum = saving * ( interest);
        int i = 0;
        while ( i < 5) {
            sum = (sum + saving) * ( interest);
            i++;
        }
        System.out.print("After sixth month, the account value is : " + String.format("%.2f",sum));
    }
}
