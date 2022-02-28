public class SmallestAndLargestNumber {
    public static void main(String[] args){

        int [] arrayOfIntegers = {1,4,0,6,778,54,22,69};
        smallestAndLargest(arrayOfIntegers);

    }
    public static void smallestAndLargest(int[] array){
        int smallestNumber = array[0];
        int  largestNumber = array[0];

        for(int i = 0; i<= array.length; i++){
            if(array[i] <= smallestNumber)
                smallestNumber = array[i];
            else if (array[i] >= largestNumber)
                largestNumber = array[i];

        }
        System.out.println("The smallest number is: " + smallestNumber);
        System.out.println("The largest number is: " + largestNumber);
    }

}
