
import java.util.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class Meee {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(str);
        JOptionPane gui = new JOptionPane();
        String diaLog = gui.showInputDialog("MEE");
        System.out.println(diaLog);
        int Data = gui.showConfirmDialog(null,"Are you Gay ?","Gay Test",JOptionPane.YES_NO_OPTION);
        System.out.println(Data);

    }
}
