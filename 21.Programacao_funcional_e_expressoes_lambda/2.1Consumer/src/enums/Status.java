package enums;

public enum Status {

    Pending("PENDENTE"),
    Processed("PROCESSADO");

    protected String pedido;

    Status(String pedido) {
        this.pedido = pedido;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
}
