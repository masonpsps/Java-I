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
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.list = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            
            if(input.equals("stop")) {
                break;
            }
            
            processCommand(input);
        }
    }
    
    public void processCommand(String command) {        
        switch(command) {
            case "add":
                add();
                break;
            case "list":
                list();
                break;
            case "remove":
                remove();
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
    }
    
    public void add() {
        System.out.println("To add: ");
        String toAdd = scanner.nextLine();

        this.list.add(toAdd);
    }
    
    public void list() {
        this.list.print();
    }
    
    public void remove() {
        System.out.println("Which one is removed?");
        int num = Integer.valueOf(scanner.nextLine());
        this.list.remove(num);
    }
}
