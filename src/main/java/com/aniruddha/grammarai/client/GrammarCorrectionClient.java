package com.aniruddha.grammarai.client;

import com.aniruddha.grammarai.dto.GrammarResponse;

public interface GrammarCorrectionClient {

    GrammarResponse correctGrammar(String text);

}