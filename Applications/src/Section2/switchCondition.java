package Section2;
import java.util.Scanner;

public class switchCondition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Command: ");
        String value = scan.nextLine();

        switch (value) {
            case "Start":
                System.out.println("Machine Started");
                break;
            case "Stop":
                System.out.println("Machine Stopped");
                break;
            default:
                System.out.println("Command not recognized");

        }
    }
}