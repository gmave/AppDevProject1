import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Farewell, Rock!");
        try (Scanner scanUser = new Scanner(System.in)) {
        System.out.println("Enter your name: ");
        String userName = scanUser.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("And goodbye" + userName + "!");
        }
    }
}
