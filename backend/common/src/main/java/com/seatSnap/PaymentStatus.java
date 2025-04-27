package com.seatSnap;

public enum PaymentStatus {
    PENDING("The payment is pending"),
    SUCCESS("The payment was successful"),
    FAILED("The payment failed"),
    REFUNDED("The payment was refunded");

    private final String description;

    PaymentStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
