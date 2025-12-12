package entities.enums;

public enum StatusPayment {
    Peding("Peding"),
    Processing("Processing"),
    Appoved("aproved"),
    Rejected("Rejected");

    private String Status;

    StatusPayment(String status) {
        Status = status;
    }
}
