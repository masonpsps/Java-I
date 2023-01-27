
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

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
        int oldest = allAges.get(0);
        for(int num : allAges) {
            if(num > oldest) {
                oldest = num;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
