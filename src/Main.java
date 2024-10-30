import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001B[1mThis is an online election for the departmental leaders 2022/2023 of Mechatronics Engineering in FUTO!\u001B[0m");

        while (true) {
            System.out.print("Are you here to vote?(yes/no): ");
            Scanner scanner = new Scanner(System.in);
            String YesNo = scanner.nextLine().toLowerCase();
            System.out.println();

            if (YesNo.equals("yes")) {
                System.out.println("To register as a Voter; ");
                Registration register = new Registration();
                register.Register();
                register.uniqueKey();
                OfficesAndCandidates OAC = new OfficesAndCandidates();
                OAC.OAC(register); //pass the registration instance
            } else if (YesNo.equals("no")) {
                System.out.println("Good Bye then!!!");
                break;
            } else {
                System.out.println("Input a valid option");
                continue;
            }
            return;
        }
    }
}