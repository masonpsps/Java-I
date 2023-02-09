
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String result = "";
        switch(this.elements.size()) {
            case 0:
                result = "The collection " + this.name + " is empty.";
                break;
            case 1:
                result = "The collection " + this.name + " has 1 element:";
                break;
            default:
                result = "The collection " + this.name + " has " + this.elements.size() + " elements:";
                break;
        }
        for(String str : elements) {
            result += "\n" + str;
        }
        
        return result;
    }
}
