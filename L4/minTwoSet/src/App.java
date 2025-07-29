import java.util.*;

class minTwoSet {
    int Array[];

    public minTwoSet(int Array[]) {
        this.Array = Array;
    }

    boolean FindDupe(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    void findMin() {
        int n = Array.length;
        int[] ArrayA = new int[n];
        int[] ArrayB = new int[n];
        int Lowest = Integer.MAX_VALUE;

        int totalSubsets = 1 << n; 

        for (int mask = 0; mask < totalSubsets; mask++) {
            Arrays.fill(ArrayA, 0);
            Arrays.fill(ArrayB, 0);
            int indexA = 0;
            int indexB = 0;
            boolean valid = true;

            for (int i = 0; i < n; i++) {
                int value = Array[i];
                if ((mask & (1 << i)) != 0) {
                    if (FindDupe(ArrayA, value)) {
                        valid = false;
                        break;
                    }
                    ArrayA[indexA++] = value;
                } else {
                    if (FindDupe(ArrayB, value)) {
                        valid = false;
                        break;
                    }
                    ArrayB[indexB++] = value;
                }
            }

            if (valid) {
                int sumA = 0, sumB = 0;
                for (int i = 0; i < indexA; i++) sumA += ArrayA[i];
                for (int i = 0; i < indexB; i++) sumB += ArrayB[i];
                int diff = Math.abs(sumA - sumB);
                if (diff < Lowest) {
                    Lowest = diff;
                }
            }
        }

        System.out.println(Lowest);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int Size = input.nextInt();
        int[] Array = new int[Size];
        int i = 0;  
        while (i < Size) {
            Array[i] = input.nextInt();
            i++;
        }
        minTwoSet minTwoSet = new minTwoSet(Array);
        minTwoSet.findMin();
    }
}
