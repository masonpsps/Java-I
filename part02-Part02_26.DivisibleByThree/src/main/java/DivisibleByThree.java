
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    
    public static void divisibleByThreeInRange(int from, int to) {
        int i = from;
        if(from % 3 != 0) {
            i = from + (3 - (from % 3));
        }
        while(i <= to) {
            System.out.println(i);
            i += 3;
        }
    }

}
