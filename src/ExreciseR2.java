public class ExreciseR2 {
    public static void main(String[] args){
        int A[] = {123,155,12,79,160,12};
        A[4] =550;
        int B[] = A.clone();

        for(int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        System.out.println("This where the array[A] stops!!!!");
        for(int i = 0; i < B.length; i++)
            System.out.println(B[i]);

    }
}
