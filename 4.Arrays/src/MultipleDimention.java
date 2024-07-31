import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class MultipleDimention {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr={
//                {1,2,3},
//                {4,13},
//                {7,6,4,9}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length);
//input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.println(arr[row][col]+ " ");
//            }
//            System.out.println();
//        }
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}