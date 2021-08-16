import java.util.ArrayList;

public class Lesson20 {
    public static void main(String[] args) {
//        void bubble_sort( int A[ ], int n ) {
//            int temp;
//            for(int k = 0; k< n-1; k++) {
//                // (n-k-1) is for ignoring comparisons of elements which have already been compared in earlier iterations
//
//                for(int i = 0; i < n-k-1; i++) {
//                    if(A[ i ] > A[ i+1] ) {
//                        // here swapping of positions is being done.
//                        temp = A[ i ];
//                        A[ i ] = A[ i+1 ];
//                        A[ i + 1] = temp;
//                    }
//                }
//            }
//        }

        bubbleSort();
    }
    public static void bubbleSort(){
        int[] numberArray = {8,5,9,2,4,6,3,7};
        for (int i = 0; i < numberArray.length - 1; i++) {
            for (int j = 0; j < numberArray.length - i - 1; j++) {
                if (numberArray[j] > numberArray[j+1]){
                    int temp = numberArray[j];
                    numberArray[j] = numberArray[j+1];
                    numberArray[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < numberArray.length ; i++) {
            System.out.println(numberArray[i]);
        }
    }

}
