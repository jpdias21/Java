package entities;

public class MediaPares {
    private double number;

    public MediaPares(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public Double Somar(MediaPares[] mediaPares){
       double calOne = 0.0;
        int poss = 0;
        for(int i = 0 ; i < mediaPares.length; i++){
            if(mediaPares[i].getNumber() % 2 == 0 ){
                calOne += mediaPares[i].getNumber();
                poss++;
            }
        }
        double calTwo = calOne / poss;
        return calTwo;
    }

    public Double MediaMediaPar(MediaPares[] mediaPares){
        double poss = 0.0;
        for(int i = 0 ; i < mediaPares.length ; i++){

            if(mediaPares[i].getNumber() % 2 == 0 ){
                poss++;
            }
        }
        return poss;
    }
}
