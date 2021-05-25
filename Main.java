public class Main {
    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
        
    }
    
    public static void addSuitcasesFullOfBricks(Container container) {
            Thing thing = new Thing("Brick", 1);
            Suitcase suitcase = new Suitcase(100);

            for(int i = 0; i < 100; i++){
                suitcase.addThing(thing);
                container.addSuitcase(suitcase);
            }
        }
    }

