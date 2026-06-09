package dataBase.model;

import java.time.LocalDate;

public class Boleto extends Pagamento {
    public Boleto(Double valor, LocalDate data, boolean status) {
        super(valor, data, status);
    }

    @Override
    public void gerarRecibo() {

    }

    @Override
    public void processar() {

    }
}
