import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Enter your name :");
        String username =scanner.next();

        System.out.println("Welcome Eng:" + username + "Please Enter Number To Check if Primary or Not Primary" );
        int number = scanner.nextInt();

        InheritancePrimaryCheck pushInput = new InheritancePrimaryCheck();
        pushInput.setNumber(number);

        DisplayOutput output = new DisplayOutput();
        output.display(number,pushInput.isPrimaryNumber());
    }
}