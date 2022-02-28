import java.util.Scanner;

public class ExerciseR8 {
    static String string;

    public static void inputString() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string value: ");
        string = input.nextLine();
        string.toLowerCase();   //convert all input to lowercase

    }

    public static int countVowels(String s) {
        int count = 0;
        char[] charArray = string.toCharArray();  // converted strings to an array of characters
        for (int i = 0; i < string.length(); i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        inputString();
        String r = "Total number of vowels in this string is: ";
        System.out.println(r + countVowels(string));
    }

}
