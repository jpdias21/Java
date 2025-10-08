package entities;

public class SumVectors {
    private int vectorOne ;
    private int vectorTwo;
    int numberVetor;

    public SumVectors(int vectorOne, int vectorTwo) {
        this.vectorOne = vectorOne;
        this.vectorTwo = vectorTwo;
    }

    public SumVectors(int n) {
        this.numberVetor = n;
    }

    public int getVectorOne() {
        return vectorOne;
    }

    public void setVectorOne(int vectorOne) {
        this.vectorOne = vectorOne;
    }

    public int getVectorTwo() {
        return vectorTwo;
    }

    public void setVectorTwo(int vectorTwo) {
        this.vectorTwo = vectorTwo;
    }
}
