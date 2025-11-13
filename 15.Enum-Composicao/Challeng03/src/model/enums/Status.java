package model.enums;

public enum Status {
    PENDIND_PAYMENT("Payment pending"),
    PROCESSING("In processing"),
    SHIPPED("Shipped"),
    DELIVERED("Delivered");

    private String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
