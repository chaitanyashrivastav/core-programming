import java.util.Scanner;

public class SumOfNUM2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number: ");
            double num = input.nextDouble();

            if (num <= 0) {
                break;
            }

            total += num;
        }

        System.out.println("The total sum is " + total);
    }
}
