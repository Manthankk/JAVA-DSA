import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);


//        // Adding elements to the ArrayList
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        // Printing the ArrayList
//        System.out.println(list.contains(2));
//        list.remove(2);
//        System.out.println(list);

        //input
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        System.out.println(list);
    }
}
