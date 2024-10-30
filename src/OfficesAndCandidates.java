import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OfficesAndCandidates {
    ArrayList<String> offices = new ArrayList<>(Arrays.asList("1. President: ", "2. Vice-president: ", "3. Secretary General: ", "4. Assistant Secretary General: "));  //*"Treasurer: ", "Financial Secretary: ", "Director of Socials: ", "Director of Sports: ", "Director of Research: ", "Provost: ", "PRO: "
    String[][] candidates = {
                            {"A. Onuaha Lewis", "B. Okonkwo Destiny", "C. Maduka Genevieve"},
                            {"A. Okeme Perfect", "B. Matthew Mark", "C. Luke John"},
                            {"A. Apostle Roman", "B. Corinthian Corinthian", "C. Ephesian Phillipians"},
                            {"A. Thessalonians Thessalonians", "B. Timothy Timothy", "C. Titus Philemon"}
    };

    public void OAC(Registration registration){ // accepts registration instance
        String votes;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Votes = new ArrayList<>();

        System.out.println("Input your unique key: ");
        String myUniqueKey = scanner.nextLine();

        if(registration.uniqueKeys.contains(myUniqueKey)) {
            for (int i = 0; i < offices.size(); i++) {
                System.out.println(offices.get(i));
                for (int j = 0; j < candidates[i].length; j++) { // This outer for loop is in charge of the rows
                    System.out.println(candidates[i][j]);
                }
                System.out.print("Your answer (enter the option alphabet): ");
                votes = scanner.nextLine().toLowerCase();

                // Map the user's choice to the corresponding candidate
                String selectedCandidate = null;
                switch (votes){
                    case "a":
                        selectedCandidate = candidates[i][0];
                        break;
                    case "b":
                        selectedCandidate = candidates[i][1];
                        break;
                    case "c":
                        selectedCandidate = candidates[i][2];
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        i--; // Stay on the same question if invalid
                        continue;
                }
                Votes.add(selectedCandidate); //add selected candidates to the array Votes

            }
        System.out.println();
        System.out.println("These are your votes");
        // Display all answers with corresponding candidates
        for (int i = 0; i < offices.size(); i++) {
            System.out.println(offices.get(i));
            System.out.println(Votes.get(i));
            System.out.println();
        }
        }
       else{
           System.out.println("Input a valid unique key");
       }

    }
}
