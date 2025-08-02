package com.example.exam7.model;

@Data
public class RollbackJournal {
    private Long id;
    private Long transactionId;
    private LocalDateTime rollbackTime;
}
