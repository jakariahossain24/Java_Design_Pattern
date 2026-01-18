
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name;
        int number;

        System.out.print("Enter your name: ");
        name=input.next();
        System.out.print("Welcome "+name);
        System.out.print("\nEnter any number: ");
        number=input.nextInt();
        System.out.println("Number= "+number);
    }
}
