package entities;

import java.util.Vector;

public class AbaixoDaMedia {
    private double number ;

    public AbaixoDaMedia(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }


    public double Calculation(AbaixoDaMedia[] abaixoDaMedia){
        double newNumber = 0.0;

        for(int i = 0 ; i < abaixoDaMedia.length  ; i++){
            newNumber += this.number;
        }

        newNumber = newNumber / abaixoDaMedia.length;
        MediaVector(newNumber,abaixoDaMedia );
        return newNumber;

    }

    public static Vector<Double> MediaVector(double newNumber, AbaixoDaMedia[] abaixoDaMedia){
        Vector<Double> media = new Vector<>();
        for(int i =0 ; i < abaixoDaMedia.length; i++){
            if(newNumber > abaixoDaMedia[i].getNumber()){
                media.add(abaixoDaMedia[i].getNumber());
            }
        }
        return media;

    }
}
