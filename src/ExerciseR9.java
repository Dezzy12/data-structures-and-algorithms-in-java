import java.util.Scanner;

public class ExerciseR9 {
    static String string;
    public static void inputString(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String value: ");
        string = input.nextLine();

    }
    private static String removePunctuation(String string){
        //using the replaceAll method,
        string = string.replaceAll("\\p{P}", "");
        return string;

    }
    public static void main(String[] args){
        inputString();
        System.out.println(removePunctuation(string));
    }

}
