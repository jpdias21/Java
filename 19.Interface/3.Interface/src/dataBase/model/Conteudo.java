package dataBase.model;

public abstract class Conteudo {

    protected String titulo;
    protected Double duracao;
    protected Integer clasificacao;

    public Conteudo(String titulo, Double duracao, Integer clasificacao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.clasificacao = clasificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public Integer getClassificao() {
        return clasificacao;
    }

    public void setClassificao(Integer clasificacao) {
        this.clasificacao = clasificacao;
    }

    public void exibirDatalhes(){
        System.out.println("Titulo : " + titulo + " Duracao: " + duracao +
                " Classificao: " + clasificacao);
    };

    public abstract void reproduzir();

}
