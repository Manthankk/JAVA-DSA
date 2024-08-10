import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("b"+2);
        System.out.println("MANthan"+ new ArrayList<>());
        System.out.println("M"+new Integer(22));
        String ans=new Integer(22)+" "+new ArrayList<>();
        System.out.println(ans);
    }
}
