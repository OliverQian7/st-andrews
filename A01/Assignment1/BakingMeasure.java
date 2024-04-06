public class BakingMeasure {
    //Fields 
    private int cups, tablespoons, teaspoons;

    //Constructor
    public BakingMeasure(int cups, int tablespoons, int teaspoons) {
        this.cups = cups;
        this.tablespoons = tablespoons;
        this.teaspoons = teaspoons;
    }

    //prints the amount of cups, tablespoons, and teaspoons. Checks for omission and plurality
    public void prettyPrint() {
        if (cups > 0) { 
            System.out.print (cups + " cup");
            if (cups > 1) System.out.print ("s");
            if (tablespoons > 0 && teaspoons > 0) {
                System.out.print(", ");
            }
            else if (tablespoons > 0 || teaspoons > 0){
                System.out.print(" and ");
            }
        }

        if (tablespoons > 0) {
            System.out.print (tablespoons + " tablespoon");
            if (tablespoons > 1) System.out.print ("s"); 
            if (teaspoons > 0) System.out.print (" and ");
        }

        if (teaspoons > 0) {
            System.out.print(teaspoons + " teaspoon");
            if (teaspoons > 1) System.out.print("s");
        }
        System.out.printf("%n");
    }
}