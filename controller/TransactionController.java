package com.example.exam7.controller;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/api/transactions")
    public ResponseEntity<Transaction> createTransaction(@Valid @RequestBody TransactionDto dto) {
        Transaction transaction = transactionService.createTransaction(dto);
        return ResponseEntity.ok(transaction);
    }

    @GetMapping("/api/transactions/{accountId}/history")
    public ResponseEntity<List<Transaction>> getTransactionHistory(@PathVariable Long accountId) {
        List<Transaction> history = transactionService.getTransactionHistory(accountId);
        return ResponseEntity.ok(history);
    }
}
