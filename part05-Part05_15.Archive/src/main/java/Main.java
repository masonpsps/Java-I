
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> archives = new ArrayList<>();
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if(id.equals("")) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.equals("")) {
                break;
            }
            
            Archive archive = new Archive(id, name);
            boolean unique = true;
            for(Archive item : archives) {
                if(item.equals(archive)) {
                    unique = false;
                }
            }
            if(unique) {
                archives.add(archive);
            }
//            archives.add(new Archive(id, name));
        }
        
        for(Archive item : archives) {
            System.out.println(item.toString());
        }
    }
}
