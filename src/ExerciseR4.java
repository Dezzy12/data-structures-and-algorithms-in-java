import java.util.Scanner;

public class ExerciseR4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the value: ");
        int n = input.nextInt();
        System.out.println(isEven(n));
    }

    public static boolean isEven(int n) {
        while (n > 0) {
            n -= 2;
            if (n == 0) {
                return true;
            }
        }
        return false;
    }
}
