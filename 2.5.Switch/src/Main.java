import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String fruit=in.next();

    switch (fruit) {
        case "Mango" -> System.out.println("king Mango");
        case "Apple" -> System.out.println("Doctor fears");
        case "orange" -> System.out.println("A round Fruit");
        case "Grapes" -> System.out.println("Small fruit");
        default -> System.out.println("Please enter Valid");
    }


}
}