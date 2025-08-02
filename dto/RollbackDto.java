package com.example.exam7.dto;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RollbackDto {
    @NotNull
    private Long transactionId;
}
