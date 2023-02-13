
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            System.out.println("");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] pieces = input.split(" ");
            int amt = Integer.valueOf(pieces[1]);
            
            if(pieces[0].equals("add")) {
                first.add(amt);
            } else if(pieces[0].equals("move")) {
                int toRemove = Math.min(first.contains(), amt);
                first.remove(toRemove);
                second.add(toRemove);
            } else if(pieces[0].equals("remove")) {
                second.remove(amt);
            }            
        }
    }

}
