
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avg = 0.0;
        int sum = 0;
        int numOfNumbers = 0;
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == 0) {
                break;
            }
            if(num > 0) {
                numOfNumbers++;
                sum += num; 
            }
        }
        if(numOfNumbers == 0) {
            System.out.println("Cannot calculate the average");
        }
        avg = (double)sum / numOfNumbers;
        System.out.println(avg);
    }
}
