
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int to = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int from = Integer.valueOf(scanner.nextLine());
        
        int increment = 1;
        if(to < from) {
            increment = -1;
        }
        for(int i = from; i <= to; i += increment) {
            System.out.println(i);
        }
    }
}
