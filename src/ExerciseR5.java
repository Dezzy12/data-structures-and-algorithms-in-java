import java.util.Scanner;

public class ExerciseR5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input value of n: ");
        int n = input.nextInt();
        String r = "The sum of integers is: ";
        System.out.println(r + sumOfAll(n));

    }

    public static int sumOfAll(int n) {
        return n * (n + 1) / 2;
    }
}
