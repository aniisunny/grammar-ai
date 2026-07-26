package com.aniruddha.grammarai.service;

import com.aniruddha.grammarai.client.GrammarCorrectionClient;
import com.aniruddha.grammarai.dto.GrammarResponse;
import org.springframework.stereotype.Service;

@Service
public class GrammarService {

    private final GrammarCorrectionClient grammarCorrectionClient;

    public GrammarService(GrammarCorrectionClient grammarCorrectionClient) {

        this.grammarCorrectionClient = grammarCorrectionClient;
    }

    public GrammarResponse correctGrammar(String text) {

        return grammarCorrectionClient.correct(text);
    }
}