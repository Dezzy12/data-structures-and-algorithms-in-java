//This are the various imports needed

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseR1 {
    public static void main(String[] args) {
        inputAllBaseTypes();
    }

    private static void inputAllBaseTypes() {
        Scanner input = new Scanner(System.in);

        List<Object> list = new ArrayList<>();    //adding items to the array list for output

        //The basic type of data are: boolean, byte,short,int,long,float,double,char

        //collecting the various types
        System.out.print("Input a Boolean: ");
        boolean aBoolean = input.nextBoolean();
        System.out.print("Input a Byte: ");
        byte aByte = input.nextByte();
        System.out.print("Input a Short: ");
        short aShort = input.nextShort();
        System.out.print("Input an Integer: ");
        int anInteger = input.nextInt();
        System.out.print("Input a Long: ");
        long aLong = input.nextLong();
        System.out.print("Input a Float: ");
        float aFloat = input.nextFloat();
        System.out.print("Input a Double: ");
        double aDouble = input.nextDouble();
        System.out.print("Input a Character: ");
        char aCharacter = input.next().charAt(0);

        //adding the types to an array list
        list.add(aBoolean);
        list.add(aByte);
        list.add(aShort);
        list.add(anInteger);
        list.add(aLong);
        list.add(aFloat);
        list.add(aDouble);
        list.add(aCharacter);

        System.out.println(list);

    }

}
