public class MetricVolume {
    //Fields
    private int millilitres;

    //Constructor
    public MetricVolume(int millilitres) {
        this.millilitres=millilitres;
    }

    //converts a measure in milliliters into cups, tablespoons and teaspoons and creates a BakingMeasure object with these quantities as its fields
    public BakingMeasure convert() {
        int totalTeaspoons = (int)(Math.round((millilitres/4.9289)));
        int finalTeaspoons = totalTeaspoons % 3;
        int totalTablespoons = totalTeaspoons / 3;
        int finalTablepoons = totalTablespoons % 16;
        int cups = totalTablespoons / 16; 
        BakingMeasure result = new BakingMeasure(cups,finalTablepoons,finalTeaspoons);
        return result; 
    } 
}