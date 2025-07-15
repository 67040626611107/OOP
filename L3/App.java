import java.util.*;

class RoachPopulation {
    private double population;

    public RoachPopulation(double pop) {
        this.population = pop;
    }
    void Wait() {
        population *= 2;
    }
    void Spray() {
        population  = population*0.9;
    }
    double getRoach() {
        return population;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input =  new Scanner(System.in);
        int value = input.nextInt();
        int round = input.nextInt();
        RoachPopulation Roach = new RoachPopulation(value);
        int i = 0;
        while (i < round) {
            Roach.Wait();
            Roach.Spray();
            i++;
        }

        System.out.println(Roach.getRoach());
    }
}
