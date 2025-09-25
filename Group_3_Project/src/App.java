
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println(); // Print a new line
        try (Scanner input = new Scanner(System.in)) {
            double weight;
            double height;

            System.out.println("Enter you weight(in pounds): ");
            weight = input.nextDouble();
            System.out.println("Enter your height(in inches): ");
            height = input.nextDouble();

            final double POUNDS = 0.45359237;
            final double INCH = 0.0254;

            double weightKg = weight * POUNDS;
            double heightM = height * INCH;
            double heightMSq = heightM * heightM;

            double bmi = weightKg / (heightMSq);
            System.out.printf("Your BMI is %f%n", bmi);

        }
    }
}
