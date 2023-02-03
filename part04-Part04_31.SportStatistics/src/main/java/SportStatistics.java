
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        int numberOfGames = 0;
        int wins = 0;
        int losses = 0;
        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
                String[] pieces = fileReader.nextLine().split(",");
                if(pieces[0].equals(team)) {
                    numberOfGames++;
                    if(Integer.valueOf(pieces[2]) > Integer.valueOf(pieces[3])) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if(pieces[1].equals(team)) {
                    numberOfGames++;
                    if(Integer.valueOf(pieces[2]) > Integer.valueOf(pieces[3])) {
                        losses++;
                    } else {
                        wins++;
                    }
                }
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + numberOfGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
