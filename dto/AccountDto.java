package com.example.exam7.dto;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    @NotBlank
    @Size(min = 3, max = 3)
    private String currency;
}
