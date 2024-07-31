import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num =(int)(45.32f);
        System.out.println(num);

//        int a=332;
//        byte b=(byte)(a);
//        byte a=100;
//        byte b=50;
//        byte c=100;
//        int d=(a*b)/c;
//        System.out.println(d);

//        int number='A';
//        System.out.println(number);

//        System.out.println(2*5.2);

        byte b=43;
        char c='a';
        short s=1024;
        int i=10000;
        float f =5.33f;
        double d=0.123;
        double result=(f*b)+(i / c)-(d-s);
        System.out.println(result);

    }
}

