/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */
public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Archive)) {
            return false;
        }
        
        Archive comp = (Archive) compared;
        
        if(this.identifier.equals(comp.identifier)
                /*&& this.name.equals(comp.name)*/) {
            return true;
        }
        
        return false;
    }
}
