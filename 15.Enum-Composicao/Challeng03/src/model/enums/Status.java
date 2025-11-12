package model.enums;

public enum Status {
    PENDENT("Pedido pendente"),
    PROCESS("Pedido em processo"),
    CONFIRM("Pedido confirmado");

    private String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
