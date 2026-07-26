package com.aniruddha.grammarai.dto;

public record GrammarMistake(
        String incorrect,
        String correct,
        String explanation
) {
}