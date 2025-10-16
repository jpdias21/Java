package entities;

import java.util.Arrays;

public class SumVectors {
    private int[] vectorOne ;
    private int[] vectorTwo ;


    public SumVectors(int[] vectorOne , int[] vectorTwo) {
        this.vectorOne = vectorOne;
        this.vectorTwo = vectorTwo;
    }


    public int[] getVectorOne() {
        return vectorOne;
    }

    public void setVectorOne(int[] vectorOne) {
        this.vectorOne = vectorOne;
    }

    public int[] getVectorTwo() {
        return vectorTwo;
    }

    public void setVectorTwo(int[] vectorTwo) {
        this.vectorTwo = vectorTwo;
    }

    public int[] Somar(){
        int [] result = new int[this.vectorOne.length];

        for(int i = 0 ; i < result.length ; i++){
            int resultOne = this.vectorOne[i] + this.vectorTwo[i];
            result[i]= resultOne;
        }
        return result;

    }

}
