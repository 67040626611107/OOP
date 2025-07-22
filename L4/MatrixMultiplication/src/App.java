import java.util.*;
class MatrixMultiplication {
    int A[],B[];
    int i,k,iL;
    public MatrixMultiplication(int i, int k,int A[],int B[], int iL) {
        this.A = A;
        this.B = B;
        this.i = i;
        this.k = k;
        this.iL = iL;
    }
    void MatrixGen() {
        int index = 0;
        int index2 = 0;
        while (index < i) {
            index2 = 0;
            while (index2 < k) {
                
            }
            index++;
        }
    }
}
public class App {
    public static int iL,iR;
    public static int kL,kR;
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        iL = input.nextInt();
        iR = input.nextInt();
        int A[] = new int[iL*iR];
        for (int i = 0; i < iL*iR;i++) {
            A[i] = input.nextInt();
        }
        kL = input.nextInt();
        kR = input.nextInt();
        int B[] = new int[kL*kR];
        for (int i = 0; i < kL*kR;i++) {
            B[i] = input.nextInt();
        }
    }
}
