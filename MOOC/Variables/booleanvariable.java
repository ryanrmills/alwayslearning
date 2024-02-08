import java.util.Scanner;

public class booleanvariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("True or False: Do you suck at coding?");

        boolean guilty = Boolean.valueOf(scanner.nextLine());

        if (guilty == true) {
            
            System.out.println("You wrote: \"" + guilty + ".\"");
        }
        else {
            System.out.println("You're lying.");
        }

            
    }
}