public class ReverseAnArray {
    /* Pseudocode:
    Step 1: create a class "ReverseAnArray"
    step 2: create array using int[] {}
    step 3: call a method to reverse the array
    step 4: use a for loop to print the original array ie (for int i=0; i<arraylength; i++)
    step 5:use a for loop to print the reverse the array ie (for int i=arraylength-1; i>=0; i--)
     */


    static int[] arrayOfIntergers = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args){
        reverseAnArray(arrayOfIntergers);


    }

        public static void reverseAnArray(int[] arr){
            System.out.println("This is the original Array");
        for(int i = 0; i < arrayOfIntergers.length; i++){

            System.out.println(arrayOfIntergers[i]);
        }
            System.out.println("End of the first Array");
        for(int i = arrayOfIntergers.length-1; i >= 0; i--) {
            System.out.println(arrayOfIntergers[i]);
        }
        }

}

