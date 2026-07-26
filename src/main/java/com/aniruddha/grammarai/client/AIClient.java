package com.aniruddha.grammarai.client;

import com.aniruddha.grammarai.dto.GrammarResponse;

public interface AIClient {

    GrammarResponse correctGrammar(String text);

}