import javax.swing.*;
import java.util.*;
public class n4 {
    static Scanner Input = new Scanner(System.in);
        public static void main(String arg[]) {
            System.out.print("Enter three points for a triangle");

            double x1  = Input.nextDouble();
            double y1  = Input.nextDouble();
            double x2  = Input.nextDouble();
            double y2  = Input.nextDouble();
            double x3  = Input.nextDouble();
            double y3  = Input.nextDouble();
            double side1,side2,side3;
            side1 = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2));
            side2 = Math.sqrt(Math.pow(x3 - x2 , 2) + Math.pow(y3 - y2 , 2));
            side3 = Math.sqrt(Math.pow(x1 - x3 , 2) + Math.pow(y1 - y3 , 2));
            double s = (side1 + side2 + side3)/ 2;
            double area = Math.sqrt(s * ( (s - side1) * (s - side2) * ( s - side3)));
            System.out.println(String.format("%.2f", area));;
        }
}
