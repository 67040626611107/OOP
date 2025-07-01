import javax.swing.*;
import java.util.*;

public class n1 {
    private static JOptionPane DialogBox = new JOptionPane();
    public static void main(String arg[]) {
        String Fahrenheit = DialogBox.showInputDialog("Enter Fahrenheit");
        double Celcius =   ((Double.parseDouble(Fahrenheit)  - 32) * (5)) / 9 ;
        // System.out.println(Celcius);
        DialogBox.showMessageDialog(DialogBox, "Celcius : " + Celcius);
    }
}
