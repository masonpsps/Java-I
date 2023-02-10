/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while(true) {
           System.out.println("Command: "); 
           String input = this.scanner.nextLine();
           
           if(input.equals("end")) {
               break;
           }
           
//           if(input.equals("add")) {
//               System.out.println("Word: ");
//               String word = scanner.nextLine();
//               System.out.println("Translation: ");
//               String translation = scanner.nextLine();
//               
//               this.dictionary.add(word, translation);
//               return;
//           }
           
//           if(input.equals("search")) {
//               System.out.println("Word: ");
//               String word = scanner.nextLine();
//               if(this.dictionary.translate(word) == null) {
//                   System.out.println("Word " + word + " was not found");
//                   return;
//               }
//               System.out.println("Translation: " + this.dictionary.translate(word));
//               return;
//           }
           
//            System.out.println("Unknown command");

            proccessCommand(input);
            System.out.println("");
        }
        System.out.println("Bye bye!");
        
        
    }
    
    public void proccessCommand(String command) {
        switch(command) {
            case "add":
                add();
                break;
            case "search":
                search();
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
    }
    
    public void add() {
            System.out.println("Word: ");
            String word = scanner.nextLine();
            System.out.println("Translation: ");
            String translation = scanner.nextLine();
            this.dictionary.add(word, translation);
    }

    public void search() {
        System.out.println("Word: ");
        String word = scanner.nextLine();
        String translation = this.dictionary.translate(word);
        if(translation == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }
    }    
}
