package com.aniruddha.grammarai.dto;

import jakarta.validation.constraints.NotBlank;

public record GrammarRequest(

        @NotBlank(message = "Text cannot be blank")
        String text

) {
}