package com.example.exam7.controller;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/transactions")
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        List<Transaction> transactions = adminService.getAllTransactions();
        return ResponseEntity.ok(transactions);
    }

    @GetMapping("/transactions/approval")
    public ResponseEntity<List<Transaction>> getPendingTransactions() {
        List<Transaction> transactions = adminService.getPendingTransactions();
        return ResponseEntity.ok(transactions);
    }

    @PostMapping("/transactions/approval")
    public ResponseEntity<?> approveTransaction(@RequestBody ApprovalDto dto) {
        adminService.approveTransaction(dto.getTransactionId());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/transactions/rollback")
    public ResponseEntity<?> rollbackTransaction(@RequestBody RollbackDto dto) {
        adminService.rollbackTransaction(dto.getTransactionId());
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/transactions/{id}")
    public ResponseEntity<?> deleteTransaction(@PathVariable Long id) {
        adminService.deleteTransaction(id);
        return ResponseEntity.ok().build();
    }
}
