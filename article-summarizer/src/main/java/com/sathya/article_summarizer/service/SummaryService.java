package com.sathya.article_summarizer.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

@Service
public class SummaryService {

    private final RestTemplate restTemplate = new RestTemplate();

    public String summarize(String article) {

        String prompt = "Summarize this article in 5 simple bullet points:\n\n" + article;

        Map<String, Object> requestBody = Map.of(
                "model", "llama3.2",
                "prompt", prompt,
                "stream", false
        );

        Map response = restTemplate.postForObject(
                "http://localhost:11434/api/generate",
                requestBody,
                Map.class
        );

        return response.get("response").toString();
    }
}