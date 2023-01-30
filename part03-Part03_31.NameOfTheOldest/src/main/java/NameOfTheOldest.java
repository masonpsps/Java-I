
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

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
        int index = 0;
        int oldest = allAges.get(index);
        for(int i = 0; i < allAges.size(); i++) {
            if(allAges.get(i) > oldest) {
                oldest = allAges.get(i);
                index = i;
            }
        }
        System.out.println("Name of the oldest: " + allNames.get(index));
    }
}
