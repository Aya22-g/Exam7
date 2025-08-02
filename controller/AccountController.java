package com.example.exam7.controller;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/api/accounts")
    public ResponseEntity<Account> createAccount(@Valid @RequestBody AccountDto dto) {
        Account account = accountService.createAccount(dto);
        return ResponseEntity.ok(account);
    }

    @GetMapping("/api/accounts/balance")
    public ResponseEntity<BigDecimal> getBalance(@RequestParam Long accountId) {
        BigDecimal balance = accountService.getBalance(accountId);
        return ResponseEntity.ok(balance);
    }

    @PostMapping("/api/accounts/balance")
    public ResponseEntity<?> deposit(@Valid @RequestBody DepositDto dto) {
        accountService.deposit(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/accounts")
    public ResponseEntity<List<Account>> getUserAccounts() {
        List<Account> accounts = accountService.getUserAccounts();
        return ResponseEntity.ok(accounts);
    }
}
