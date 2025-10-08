package entities;

public class HighestPosition {
    private double number;

    public HighestPosition(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
   public static HighestPosition finMax(HighestPosition[] array) {
       HighestPosition highestPositions = array[0];
       for(HighestPosition hp: array){
           if(hp.getNumber() > highestPositions.getNumber()){
               highestPositions = hp;
           }
       }
        return highestPositions;
   }

}
