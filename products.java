import java.util.Scanner;

public class products {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        Scanner input3=new Scanner(System.in);
        Scanner input4=new Scanner(System.in);

        int id,price;
        String  title,description, category;

        System.out.println("Enter your id: ");
        id=input.nextInt();

        System.out.println("Enter your product price: ");
        price=input1.nextInt();

        System.out.println("Enter your product title: ");
        title=input2.next();

        System.out.println("Enter your product description: ");
        description=input3.next();

        System.out.println("Enter your product category: ");
        category=input4.next();

        System.out.println("Product id: "+id);
        System.out.println("Product price: "+price);
        System.out.println("Product title: "+title);
        System.out.println("Product description: "+description);
        System.out.println("Product category: "+category);
    }
}
