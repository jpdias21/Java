package entities;

public class Aprovados {
    private String name;
    private double notaOne;
    private double noteTwo;

    public Aprovados(String name, double notaOne, double noteTwo) {
        this.name = name;
        this.notaOne = notaOne;
        this.noteTwo = noteTwo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNotaOne() {
        return notaOne;
    }

    public void setNotaOne(double notaOne) {
        this.notaOne = notaOne;
    }

    public double getNoteTwo() {
        return noteTwo;
    }

    public void setNoteTwo(double noteTwo) {
        this.noteTwo = noteTwo;
    }

    public double[] AlunosAprovados(Aprovados[] aprovados){

        
        for(int i = 0 ; i < aprovados.length; i++){

        }

    }
}
