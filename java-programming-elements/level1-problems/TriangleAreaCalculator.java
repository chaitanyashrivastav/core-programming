import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in centimeters: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in centimeters: ");
        double height = input.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / 6.4516; // 1 square inch = 6.4516 square cm

        System.out.println("The area of the triangle in square centimeters is " + areaCm2 +
                           " and in square inches is " + areaIn2);
    }
}
