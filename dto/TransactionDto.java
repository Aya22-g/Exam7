package com.example.exam7.dto;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {
    @NotNull
    private Long fromAccountId;

    @NotNull
    private Long toAccountId;

    @NotNull
    @DecimalMin(value = "0.01")
    private BigDecimal amount;

    @NotBlank
    @Size(min = 3, max = 3)
    private String currency;
}
