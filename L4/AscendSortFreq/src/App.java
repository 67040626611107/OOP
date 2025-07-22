
class AscendSortFreq {
    int num[];
    int Freq[];
    int temp ;
    boolean tempArray[];
    public AscendSortFreq(int n[]) {
        this.num = n;
        this.tempArray = new boolean[100];
        this.Freq = new int[100];
    }
    void AscendSort() {
        int i = 0;
        int i2 = 0;
        while (i < num.length-1) {
            i2 = 0;
            while (i2 < num.length- i -1) { 
                if (num[i2] > num[i2+1]) {
                    temp = num[i2+1];
                    num[i2+1] = num[i2];
                    num[i2] = temp;
                }
                i2++;
            }
            i++;
        }
        i = 0;
        while (i <  num.length ) {
            if (!tempArray[num[i]]) {
                tempArray[num[i]] = true;
                System.out.print(String.format("%d ", num[i]));
            }
            i++;
        }
        System.out.print("\n");
    }
    void SortCommuFreq() {
        int i = 0;
        while (i < num.length) { 
            Freq[num[i]]++;
            i++;
        }
        i = 0;
        int sum = 0;
        while (i < Freq.length) {
            if (Freq[i] > 0) {
                sum += Freq[i];
                System.out.print(String.format("Num %d : Freq %d \n", i,sum));
            }
            i++;
        }
    }

}
public class App {
    public static void main(String[] args) throws Exception {
        int A[] = {9 ,5 ,9 ,5 ,8};
        AscendSortFreq AscendSortFreq = new AscendSortFreq(A);
        AscendSortFreq.AscendSort();
        AscendSortFreq.SortCommuFreq();
        // System.out.println("Hello, World!");
    }
}
