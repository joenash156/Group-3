
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println(); // Print a new line
        try (Scanner input = new Scanner(System.in)) {
            // double weight;
            // double height;

            // System.out.print("Enter you weight(in pounds): ");
            // weight = input.nextDouble();
            // System.out.print("Enter your height(in inches): ");
            // height = input.nextDouble();

            // final double POUNDS = 0.45359237;
            // final double INCH = 0.0254;

            // double weightKg = weight * POUNDS;
            // double heightM = height * INCH;
            // double heightMSq = heightM * heightM;

            // double bmi = weightKg / (heightMSq);
            // System.out.printf("Your BMI is %fkg/m^2 %n", bmi);

            char letter; // Init a variable

            // Take user's input
            System.out.print("Enter a letter: ");
            // Assign the first character to variable letter
            letter = input.next().charAt(0); 

            // Use switch
            switch(letter) {
                case 'a','b','c', 'A' -> {
                    System.out.println("2");
                    break;
                }
                case 'd','e','f' -> {
                    System.out.println("3");
                    break;
                }
                case 'g','h','i' -> {
                    System.out.println("4");
                    break;
                }
                case 'j','k','l' -> {
                    System.out.println("5");
                    break;
                }
                case 'm','n','o' -> {
                    System.out.println("6");
                    break;
                }
                case 'p','q','r', 's' -> {
                    System.out.println("7");
                    break;
                }
                case 't','u','v' -> {
                    System.out.println("8");
                    break;
                }
                case 'w','x','y', 'z' -> {
                    System.out.println("9");
                    break;
                }
                default -> {
                    System.out.println("0 or Nothing");
                }
                
            }

        }
    }
}
