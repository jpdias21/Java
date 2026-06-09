package dataBase.model;

import java.time.LocalDate;

public abstract class Pagamento {

    protected Double valor;
    protected LocalDate data;
    protected boolean status;

    public Pagamento(Double valor, LocalDate data, boolean status) {
        this.valor = valor;
        this.data = data;
        this.status = status;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void gerarRecibo() {

    }

    public abstract void processar();


}
