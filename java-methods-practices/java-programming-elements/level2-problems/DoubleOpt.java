import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a (double): ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b (double): ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c (double): ");
        double c = input.nextDouble();

        double result1 = a + b * c;  // Multiplication (*) is performed before addition (+)
        double result2 = a * b + c;  // Multiplication (*) is performed before addition (+)
        double result3 = c + a / b;  // Division (/) is performed before addition (+)
        double result4 = a % b + c;  // Modulus (%) is performed before addition (+)

        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
