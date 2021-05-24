import java.util.ArrayList;

public class Container {

    private int maxWeight; 
    private int currentWeight = 0;
    ArrayList<Suitcase> cases = new ArrayList<Suitcase>();
    
    public Container(int maxWeight){
        this.maxWeight = maxWeight;
        
    }

    public void addSuitcase(Suitcase suitcase){
        int checkWeight = maxWeight;
        
        if(currentWeight + suitcase.totalWeight() <= checkWeight){
            cases.add(suitcase);
            currentWeight += suitcase.totalWeight();
        }
    }

    public String toString(){
        String output = "";
        output += cases.size() + " suitcases " + "( " + this.currentWeight + " kg )";
    
        return output; 
        
    
    }
}
