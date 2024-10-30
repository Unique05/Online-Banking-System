import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Registration {
    String name;
    String matriculationNumber;
    String level;

    ArrayList<String> uniqueKeys = new ArrayList<>();

    public void Register (){
        System.out.println("\u001B[1mEnter the following fields\u001B[0m");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Full Name: ");
        name = scanner.nextLine();

        while (true) {
            System.out.print("Matriculation number: ");
            matriculationNumber = scanner.nextLine();
            if (matriculationNumber.length() != 11){
                System.out.println("Enter a valid Matriculation number.");
                continue;
            }
            else{
                break;
            }
        }

        while(true) {
            System.out.print("Level: ");
            level = scanner.nextLine();
            switch (level){
                case "100":
                    break;
                case "200":
                    break;
                case "300":
                    break;
                case "400":
                    break;
                case "500":
                    break;
                default:
                    System.out.println("Enter a valid level (100/200/300/400/500)");
                    continue;
            }
            return;
        }

    }

    public String uniqueKey(){
        Random random = new Random();
        int randomNumber1 = random.nextInt(10);
        int randomNumber2 = random.nextInt(10);

        String lastThreeDigits = matriculationNumber.substring(Math.max(0, matriculationNumber.length() - 3)); // stores the last three digits of matriculationNumber

        String firstLetters = name.substring(0, Math.min(2, name.length())).toUpperCase(); // stores the first two letters of name

        String uniqueKey = randomNumber1 + lastThreeDigits + + randomNumber2 + firstLetters;
        uniqueKeys.add(uniqueKey);
        System.out.println("This is your personal unique key " + uniqueKey);
        return uniqueKey;

//       for(int i = 0; i < uniqueKeys.size(); i++){
//            System.out.println(uniqueKeys.get(i));
//        }

    }
}
