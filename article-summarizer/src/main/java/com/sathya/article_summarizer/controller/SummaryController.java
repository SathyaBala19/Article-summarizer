package com.sathya.article_summarizer.controller;

import org.springframework.web.bind.annotation.*;

import com.sathya.article_summarizer.dto.SummaryRequest;
import com.sathya.article_summarizer.dto.SummaryResponse;
import com.sathya.article_summarizer.service.SummaryService;

import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class SummaryController {

    private final SummaryService summaryService;

    public SummaryController(SummaryService summaryService) {
        this.summaryService = summaryService;
    }

    @PostMapping("/summarize")
    public SummaryResponse summarize(@RequestBody SummaryRequest request) {

        String summary = summaryService.summarize(request.getArticle());

        return new SummaryResponse(summary);
    }
}