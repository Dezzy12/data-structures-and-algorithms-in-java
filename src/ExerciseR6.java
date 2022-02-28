import java.util.Scanner;

public class ExerciseR6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input value of n: ");
        int n = input.nextInt();
        //String r = "The sum of integers is: ";
        int[] oddNumbers = new int[n / 2 +1];

        int i = 0;
        int sum = 0;
        for ( int odd = 1; odd <= n; odd++){
            if (odd % 2 ==1){
                oddNumbers[i++] = odd;
            }
        }
        for (i = 0; i < oddNumbers.length; i++){
            sum += oddNumbers[i];
        }

        System.out.println(sum);

    }
}
