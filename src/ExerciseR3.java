import java.util.Scanner;

public class ExerciseR3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the value of n: ");
        long n = input.nextLong();
        System.out.print("Input the value of m: ");
        long m = input.nextLong();
        System.out.println(isMultiple(n, m));

    }

    public static boolean isMultiple(long n, long m) {
        if (m > n) {
            return isMultiple(m, n);
        }
        return n % m == 0;
    }

}
