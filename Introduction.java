import java.util.Scanner;

public class Introduction {
    public void intro() {
        Scanner scan = new Scanner(System.in);
        System.out.print("What's your name?: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + ". Welcome to Lemonade stand!");
    }
    
}
