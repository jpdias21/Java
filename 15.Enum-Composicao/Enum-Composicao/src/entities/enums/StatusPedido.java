package entities.enums;

public enum StatusPedido {
    PREPARO("Preparo"),
    FEITO("Feiro"),
    EM_ROTA("Em_Rota"),
    ENTREGUE("Entregue pedido pedido pedido");

    private String Status;

    StatusPedido(String status) {
        Status = status;
    }

    public String getStatus() {
        return Status;
    }
}
