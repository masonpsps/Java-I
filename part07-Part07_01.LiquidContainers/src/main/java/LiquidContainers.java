
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.println("");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] pieces = input.split(" ");
            int amt = Integer.valueOf(pieces[1]);
            
            if(pieces[0].equals("add")) {
                if(amt < 0) {
                    return;
                }
                first = Math.min(100, first + amt);
            } else if(pieces[0].equals("move")) {
                int toMove = Math.min(first, amt);
                first = Math.max(0, first - amt);
                second = Math.min(100, second + toMove);
            } else if(pieces[0].equals("remove")) {
                second = Math.max(0, second - amt);
            }            
        }
    }
}
