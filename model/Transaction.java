package com.example.exam7.model;

@Data
public class Transaction {
    private Long id;
    private Long fromAccountId;
    private Long toAccountId;
    private BigDecimal amount;
    private String currency;
    private String status; // PENDING, COMPLETED, ROLLED_BACK, DELETED
    private LocalDateTime timestamp;
}
