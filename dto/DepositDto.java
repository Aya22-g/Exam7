package com.example.exam7.dto;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepositDto {
    @NotNull
    private Long accountId;

    @NotNull
    @DecimalMin(value = "0.01")
    private BigDecimal amount;
}
