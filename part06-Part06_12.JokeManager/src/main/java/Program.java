
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        JokeManager jokeManager = new JokeManager();
        Scanner scanner = new Scanner(System.in);
        
        UserInterface ui = new UserInterface(jokeManager, scanner);
        
        ui.start();
    }
}
