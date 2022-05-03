package com.example.monthlysnack.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Customer {
    private final UUID customerId;
    private final String name;
    private final String email;
    private final String address;
    private final String postcode;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public Customer(UUID customerId, String name, String email,
                    String address, String postcode, LocalDateTime createdAt,
                    LocalDateTime updatedAt) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.postcode = postcode;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return postcode;
    }

    public String getPostcode() {
        return postcode;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
