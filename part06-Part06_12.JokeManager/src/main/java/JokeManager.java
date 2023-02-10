/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        if(this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        
        Random rand = new Random();
        return this.jokes.get(rand.nextInt(jokes.size()));
    }
    
    public void printJokes() {
        if(this.jokes.isEmpty()) {
            return;
        }
        
        for(String joke : this.jokes) {
            System.out.println(joke);
        }
    }
}
