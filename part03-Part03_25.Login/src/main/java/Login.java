
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] users = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};
        
        System.out.println("Enter username: ");
        String user = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        
        int index = -1;
        for(int i = 0; i < users.length; i++) {
            if(users[i].equals(user)) {
                index = i;
                break;
            }
        }
        if(index == -1 || !passwords[index].equals(password)) {
            System.out.println("Incorrect username or password!");
        } else if(passwords[index].equals(password)) {
            System.out.println("You have successfully logged in!");
        }
    }
}
