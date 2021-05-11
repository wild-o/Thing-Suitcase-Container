import java.util.ArrayList;

public class Suitcase {
    
    private int maxWeight; 
    private int currentWeight = 0;
    ArrayList<Thing> things = new ArrayList<Thing>();
     

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        
    }

    public void addThing(Thing thing){
        int checkWeight = maxWeight;
        

        if(currentWeight + thing.getWeight() <= checkWeight){
            things.add(thing);
            currentWeight += thing.getWeight();
        }

    }
    
    public String toString(){

        String str = "empty " + "(" + this.currentWeight + " kg) ";
        
        for(Thing thing: things){
            str = things.size() + " thing" + " (" + this.currentWeight + " kgs) ";
            
            if(things.size() > 1){
                str = things.size() + " things" + " (" + this.currentWeight + " kgs) ";
            }

        }
        return str; 
        
    }

}
