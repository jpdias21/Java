package dataBase.model;

import java.time.LocalDate;

public class Cartao extends Pagamento implements Estornar, Parcelavel {
    public Cartao(Double valor, LocalDate data, boolean status) {
        super(valor, data, status);
    }

    @Override
    public void gerarRecibo() {

    }

    @Override
    public void processar() {

    }

    @Override
    public void estornar() {
        
    }

    @Override
    public void calcularParcela() {

    }
}
