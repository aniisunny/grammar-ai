package com.aniruddha.grammarai.client;

import com.aniruddha.grammarai.dto.GrammarMistake;
import com.aniruddha.grammarai.dto.GrammarResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MockGrammarCorrectionClient implements GrammarCorrectionClient {

    @Override
    public GrammarResponse correct(String text) {

        return new GrammarResponse(
                text,
                "I went to the office yesterday.",
                75,
                "A2",
                List.of(
                        new GrammarMistake(
                                "goes",
                                "went",
                                "Past tense should be used with 'yesterday'."
                        )
                ),
                "I went to school yesterday."
        );
    }
}