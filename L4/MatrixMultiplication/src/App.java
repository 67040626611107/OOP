import java.util.*;
class MatrixMultiplication {
    int A[],B[];
    int i,kR,iL;
    int NewMatrix[];
    public MatrixMultiplication(int A[],int B[], int iL,int kR) {
        this.A = A;
        this.B = B;
        this.i = iL*kR;
        this.NewMatrix  = new int[i+1];
        System.out.println(i);
        this.kR = kR;
        this.iL = iL;
    }
    void ShowMatrix() {
        int index = 1;
        while (index <=  i) {
            System.out.print(NewMatrix[index]);
            if (index % kR  == 0) {
                System.out.print("\n");
                
            } else  {
                System.out.print(" ");
            }
            index++;
        }
    }
    void MatrixGen() {
        int index = 0;
        int index2 = 0;
        int index3 = 1;
        int index4 = 0;
        while (index < iL) {
            index2 = 0;
            while (index2 < kR) {
                NewMatrix[index3] = A[index4] * B[index2];
                NewMatrix[index3] += A[index4+1] * B[index2+kR];
                index2++;
                index3++;
            }
            index4+=2;
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
        MatrixMultiplication Martrix = new MatrixMultiplication(A,B,iL,kR);
        Martrix.MatrixGen();
        Martrix.ShowMatrix();
    }
}
