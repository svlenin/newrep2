import java util.Scanner;
public class home {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(":");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}