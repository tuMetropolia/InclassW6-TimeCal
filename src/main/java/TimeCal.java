import java.util.Scanner;

public class TimeCal {
    public static void main(String[] args) {
        System.out.println("Time needs " + timeCalculator(100, 100));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance: ");
        double x = sc.nextDouble();
        System.out.println("Enter the velocity: ");
        double v = sc.nextDouble();
        System.out.println("Time needs " + timeCalculator(x, v));
    }

    public static double timeCalculator(double x, double v) {
        return x/v;
    }
}
