import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans=sum();
        System.out.println(ans);
    }

    static int  sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = in.nextInt();
        System.out.println("Enter num2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
//    static void sum() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter num1:");
//        int num1 = in.nextInt();
//        System.out.println("Enter num2:");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The sum=" + sum);
//    }
}
