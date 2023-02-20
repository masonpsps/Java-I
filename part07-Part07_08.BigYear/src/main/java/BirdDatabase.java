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

public class BirdDatabase {
    private ArrayList<Bird> birds;
    private ArrayList<Integer> observations;
    
    public BirdDatabase() {
        this.birds = new ArrayList<>();
        this.observations = new ArrayList<>();
    }
        
    public void addBird(Bird bird) {
        if(this.birds.contains(bird)) {
            return;
        }
        this.birds.add(bird);
        this.observations.add(0);
    }
    
    public void addObservation(String birdName) {
        int index = -1;
        for(int i = 0; i < this.birds.size(); i++) {
            if(this.birds.get(i).getName().equals(birdName)) {
                index = i;
            }
        }
        
        if(index == -1) {
            System.out.println("Not a bird!");
        } else {
            this.observations.set(index, this.observations.get(index) + 1);
        }
    }
    
    public String printBird(String birdName) {
        int index = -1;
        for(int i = 0; i < this.birds.size(); i++) {
            if(this.birds.get(i).getName().equals(birdName)) {
                index = i;
            }
        }
        
        if(index == -1) {
            return "";
        }
        return this.birds.get(index).getName() + " (" + 
                this.birds.get(index).getLatinName() + "): " + 
                this.observations.get(index) + " observations";
    }
    
    public String printAll() {
        String result = "";
        for(Bird bird : this.birds) {
            result += printBird(bird.getName()) + "\n";
        }
        
        return result;
    }
}
