package com.clodomilson.erpapi.customer.dto;

import jakarta.validation.constraints.NotBlank;

public record CustomerRequest(

        @NotBlank(message = "Nome é obrigatório")
        String name,

        String email,

        String phone

) {
}