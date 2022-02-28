import java.util.Scanner;

public class SumOfSquares {
    static int number;
    long sum;
    private void takeInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the value: ");
        number = input.nextInt();
    }
    public long sumOfSquareIntegers(int n){
        for (int i = 0; i <= number; i++){
            sum += (i*i) / 2;
        }
        return sum;
    }
    public static void main(String[] args){

        SumOfSquares squares = new SumOfSquares();
        squares.takeInput();
        System.out.println(squares.sumOfSquareIntegers(number));
    }

}

