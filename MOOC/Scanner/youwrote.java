import java.util.Scanner;

public class youwrote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something: ");

        String message = scanner.nextLine();

        System.out.println("You wrote : \"" + message + "\"");
    }
}