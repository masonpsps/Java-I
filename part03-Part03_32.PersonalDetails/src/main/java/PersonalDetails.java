
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> allNames = new ArrayList<>();
        ArrayList<Integer> allAges = new ArrayList<>();
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            allNames.add(pieces[0]);
            allAges.add(Integer.valueOf(pieces[1]));
        }
        String longestName = allNames.get(0);
        for(int i = 0; i < allNames.size(); i++) {
            if(allNames.get(i).length() > longestName.length()) {
                longestName = allNames.get(i);
            }
        }
        int sum = 0;
        for(int num : allAges) {
            sum += num;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Averagef the birth years: " + ((double)sum / allAges.size()));

    }
}
