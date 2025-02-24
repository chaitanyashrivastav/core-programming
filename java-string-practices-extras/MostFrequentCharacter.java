import java.util.Scanner;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        char mostFrequentChar = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: " + mostFrequentChar);
    }

    public static char findMostFrequentCharacter(String str) {
        int maxCount = 0;
        char mostFrequentChar = '\0';
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;
            
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }
            
            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = currentChar;
            }
        }
        
        return mostFrequentChar;
    }
}
