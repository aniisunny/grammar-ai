package com.aniruddha.grammarai.dto;

import java.util.List;

public record GrammarResponse(
        String originalText,
        String correctedText,
        Integer grammarScore,
        String cefrLevel,
        List<GrammarMistake> mistakes,
        String practiceSentence
) {
}

//Why Records?
//
//Unlike traditional DTOs, records are:
//
//Immutable
//        Concise
//Thread-safe by design
//Automatically generate constructors, getters, equals(), hashCode(), and toString()