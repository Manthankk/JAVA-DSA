import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        arr[0]=32;
        arr[1]=312;
        arr[2]=322;
        arr[3]=323;
        arr[4]=325;
        System.out.println(arr[3]);

        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
//        System.out.println(Arrays.toString(arr));
//        for (int num : arr) {
//            System.out.println(num + " ");
//        }

//        String[] str=new String[4];
//        for(int i=0;i<str.length;i++){
//            str[i]=in.next();
//        }
//        System.out.println(Arrays.toString(str));


    }
}
