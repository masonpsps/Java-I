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

public class UserInterface {
    private Scanner scanner;
    private BirdDatabase database;
    
    public UserInterface(Scanner scanner, BirdDatabase database) {
        this.scanner = scanner;
        this.database = database;
    }
    
    public void start() {
        System.out.println("Commands: \n"
                    + "Add - adds a bird to the database\n"
                    + "Observation - adds an observation of a bird in the database\n"
                    + "All - prints all birds in the database\n"
                    + "One - prints one bird\n"
                    + "Quit - ends the program\n");
            
        while(true) {
            System.out.println("?");
            String command = this.scanner.nextLine();
            if(command.equals("Quit")) {
                System.out.println("Goodbye!");
                break;
            }
            
            processCommand(command);
        }
    }
    
    public void processCommand(String command) {
        switch(command) {
            case "Add":
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scanner.nextLine();
                
                database.addBird(new Bird(name, latinName));
                break;
            case "Observation":
                System.out.println("Bird?");
                String birdObserved = scanner.nextLine();
                
                database.addObservation(birdObserved);
                break;
            case "All":
                System.out.println(database.printAll());
                break;
            case "One":
                System.out.println("Bird?");
                String birdToPrint = scanner.nextLine();
                
                System.out.println(database.printBird(birdToPrint));
                break;
            default: 
                break;
        }
    }
}
