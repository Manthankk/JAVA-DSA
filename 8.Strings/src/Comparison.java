//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Comparison {
    public static void main(String[] args) {
        String a="manthan";
        String b="manthan";

        System.out.println(a == b);
        String name1=new String ("manthan");
        String name2=new String("manthan   ");

        System.out.println(name1.equals(name2 ));
        System.out.println(name1.charAt(1));
    }
}