package dataBase.model;

public class Trailer extends Conteudo {

    public Trailer(String titulo, Double duracacao, Integer classificao) {
        super(titulo, duracacao, classificao);
    }

    public void reproduzir(){
        System.out.println("Reproduzir video" + titulo);
    }
}

