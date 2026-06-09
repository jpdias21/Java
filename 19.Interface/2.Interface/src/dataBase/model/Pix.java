package dataBase.model;

import java.time.LocalDate;

public class Pix extends Pagamento{


    public Pix(Double valor, LocalDate data, boolean status) {
        super(valor, data, status);
    }

    @Override
    public void gerarRecibo() {

    }

    @Override
    public void processar() {

    }
}
