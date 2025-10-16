package entities;

import java.util.ArrayList;

public class Notas {
    private Double nota;

    public Notas(Double nota) {
        this.nota = nota;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public static double mediaNotas(ArrayList<Double> notas){
        double soma = 0.0;
        for(Double nota : notas){
           soma += nota;
        }

            return soma / notas.size();
    }
}

