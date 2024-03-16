package basics;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*System.out.println("Enter a Number: ");
        int value = input.nextInt();
        System.out.println("Your entered: "+ value);

        System.out.println("Enter a Floating Number: ");
        double value = input.nextDouble();
        System.out.println("Your entered: "+ value);*/

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Your name is "+ name);
    }
}
