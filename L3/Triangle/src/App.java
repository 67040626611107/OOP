import java.util.*;
class MyTriangle {
    private double s1,s2,s3;
    public MyTriangle(double s1,double s2,double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    public boolean isVaild() {
        return s1+s2 > s3;
    }
    public double area() {
        double s = (s1+s2+s3) /2;
        return Math.sqrt(s * (s - s1 ) *(s - s2 ) * (s - s3 ) );
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int s1,s2,s3;
        s1=  input.nextInt(); 
        s2 = input.nextInt();
        s3  =input.nextInt();
        MyTriangle MyTriangle = new MyTriangle(s1, s2, s3);
        if (MyTriangle.isVaild()) {
            System.out.println(String.format("%.2f", MyTriangle.area()));
        } else {
            System.out.println(String.format("%d", 0));
        }
    }
}
