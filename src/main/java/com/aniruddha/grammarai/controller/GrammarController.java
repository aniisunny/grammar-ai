package com.aniruddha.grammarai.controller;

import com.aniruddha.grammarai.dto.GrammarRequest;
import com.aniruddha.grammarai.dto.GrammarResponse;
import com.aniruddha.grammarai.service.GrammarService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/grammar")
public class GrammarController {

    private final GrammarService grammarService;

    public GrammarController(GrammarService grammarService) {

        this.grammarService = grammarService;
    }

    @PostMapping("/check")
    public GrammarResponse checkGrammar(@Valid @RequestBody GrammarRequest request) {

        return grammarService.correctGrammar(request.text());
    }
}