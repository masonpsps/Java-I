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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if(this.totalWeight() + item.getWeight() > this.maxWeight) {
            return;
        }
        this.items.add(item);
    }
    
    public String toString() {
        if(this.items.size() == 0) {
            return "no items (0 kg)";
        }
        
        String isPlural = "s";        
        if(this.items.size() == 1) {
            isPlural = "";
        }
        return this.items.size() + " item" + isPlural + " (" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        if(this.items.size() == 0) {
            return;
        }
        for(Item item : items) {
            System.out.println(item.toString());
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for(Item item : items) {
            weight += item.getWeight();
        }
        
        return weight;
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);
        
        for(Item item : items) {
            if(item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    
    
}
