import java.util.Scanner;
public class greeting {

    public static void main(String[] args) {

        System.out.print("Java Values: ");
        System.out.print(3.1416);
        System.out.print(',');
        System.out.print(15);
        System.out.println("( double, char, int).");


        Scanner input = new Scanner(System.in);
        /*System.out.print("Enter your age in years: ");
        double age = input.nextDouble();
        System.out.print("Enter your maximum heart rate: ");
        double rate = input.nextDouble();
        double fb = (rate-age)*0.65;
        System.out.println("Your ideal fat-burning heart rate is " + fb);*/

        System.out.print("Please enter an interger: ");
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.print("Invalid interger; please enter an integer ");
        }


        int a = 3;
        int b = 4;
        int m = 0;

        String r = "The minimum between the two numbers is ";
        m = Math.min(a,b);
        System.out.println(r + m);

    }
}
