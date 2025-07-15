import java.util.Scanner;

class PiEstimate {
    private double Round = 0;
    public PiEstimate (double r){
        this.Round = r;
    }
    double Estimate() {
        double result = 0.0;
        double sign;
        for (int i = 1; i <= Round; i++) {
            sign = ((i % 2) == 0) ? -1.0 : 1.0;
            result += sign  / (2 * i - 1);
        }
        return 4 * result;
    } 
}
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int round = input.nextInt();
        PiEstimate PiEstimate = new PiEstimate(round);
        System.out.println(String.format("%.4f", PiEstimate.Estimate()));
    }
}
