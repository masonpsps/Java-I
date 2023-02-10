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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(this.totalWeight() + suitcase.totalWeight() > this.maxWeight) {
            return;
        }
        
        this.suitcases.add(suitcase);
    }
    
    public int totalWeight() {
        if(this.suitcases.isEmpty()) {
            return 0;
        }
        
        int weight = 0;
        for(Suitcase suitcase : suitcases) {
            weight += suitcase.totalWeight();
        }
        
        return weight;
    }
    
    public String toString() {
        if(this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        
        String isPlural = "s";
        if(this.suitcases.size() == 1) {
            isPlural = "";
        }
        
        int weight = 0;
        for(Suitcase suitcase : suitcases) {
            weight += suitcase.totalWeight();
        }
        
        return this.suitcases.size() + " suitcase" + isPlural + " (" + weight + " kg)";
    }
    
    public void printItems() {
        if(this.suitcases.isEmpty()) {
            System.out.println("There are no items in the hold.");
        }
        
        for(Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
