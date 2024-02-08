import java.util.Scanner;

public class readintegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a value:");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("You wrote: \"" + value + "\"");
        System.out.println(value + 500);
        
        System.out.println("Write a decimal this time: ")


    }
}