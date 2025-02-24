import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        String result = removeDuplicates(str);
        System.out.println("String without duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (result.indexOf(str.charAt(i)) == -1) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
