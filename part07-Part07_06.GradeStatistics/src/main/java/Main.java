
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        ArrayList<Integer> inputs = new ArrayList<>();
        
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1) {
                break;
            }
            
            if(input >= 0 && input <= 100) {
                inputs.add(input);
            }
        }
        
        System.out.println("Point average (all): " + average(inputs));
        System.out.println("Point average (passing): " + averageOfPassing(inputs)[0]);
        System.out.println("Pass percentage: " + averageOfPassing(inputs)[1]);
        System.out.println("Grade distribution: " + gradeDistribution(inputs));
    }
    
    public static double average(ArrayList<Integer> points) {
        int sum = 0;
        for(Integer num : points) {
            sum += num;
        }
        
        return (double)sum / points.size();
    }
    
    public static double[] averageOfPassing(ArrayList<Integer> points) {
        int sum = 0;
        int size = 0;
        for(Integer num : points) {
            if(num >= 50) {
                sum += num;
                size++;
            }
        }
        // result contains the avg of passings scores at [0]
        // and the percentage of the total grades that are passing at [1]
        double[] result = {(double)sum / size, (double)size * 100 / points.size()};
        return result;
    }
    
    public static String gradeDistribution(ArrayList<Integer> points) {
        String[] result = {"5: ", "4: ", "3: ", "2: ", "1: ", "0: "};
        for(Integer num : points) {
            if(num < 50) {
                result[5] += "*";
            } else if(num < 60) {
                result[4] += "*";
            } else if(num < 70) {
                result[3] += "*";
            } else if(num < 80) {
                result[2] += "*";
            } else if(num < 90) {
                result[1] += "*";
            } else if(num >=90) {
                result[0] += "*";
            }
        }
        
        return result[0] + "\n" + result[1] + "\n" + 
               result[2] + "\n" + result[3] + "\n" + 
               result[4] + "\n" + result[5];
    }
}
