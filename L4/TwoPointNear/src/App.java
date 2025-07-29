import java.util.*;

class TwoPoint {
    double[] ArrayX;
    double[] ArrayY;

    public TwoPoint(double[] ArrayX, double[] ArrayY) {
        this.ArrayX = ArrayX;
        this.ArrayY = ArrayY;
    }

    void FindNearestTwoPoint() {
        double minDistance = Double.MAX_VALUE;

        for (int i = 0; i < ArrayX.length - 1; i++) {
            for (int j = i + 1; j < ArrayX.length; j++) {
                double dx = ArrayX[i] - ArrayX[j];
                double dy = ArrayY[i] - ArrayY[j];
                double distance = Math.sqrt(dx * dx + dy * dy);
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }

        System.out.printf("%.2f\n", minDistance);
    }
}

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Size = input.nextInt();

        double[] ArrayX = new double[Size];
        double[] ArrayY = new double[Size];

        for (int i = 0; i < Size; i++) {
            ArrayX[i] = input.nextDouble();
            ArrayY[i] = input.nextDouble();
        }

        TwoPoint tp = new TwoPoint(ArrayX, ArrayY);
        tp.FindNearestTwoPoint();
    }
}
