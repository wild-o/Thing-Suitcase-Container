import java.util.ArrayList;

public class Suitcase {
    
    private int maxWeight; 
    private int currentWeight = 0;
    ArrayList<Thing> things = new ArrayList<Thing>();
     

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        
    }

    public void printThings(){
        for(Thing thing: things){
            System.out.println(thing);
        }
    }

    public int totalWeight(){

        int total = 0;

        for(Thing thing: things){
            total += thing.weight; 
        }

        return total; 
    }

    public Thing heaviestThing(){
        Thing heaviest = null;
        if (things.size() > 0) {
            heaviest = things.get(0);
            for (Thing thing : things) {
                if (heaviest.getWeight() < thing.getWeight()) {
                    heaviest = thing;
                }
            }
        }
        return heaviest;
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
