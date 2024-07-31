import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

    }
        static boolean isPrime(int n){
        if(n <=1){
            return false;
        }
        int c=2;
        while(c*c <=n){
            if (n %c ==0){
                return true; 

            }
            c++;
        }
        return c*c>n;
        }
}
