# Article-summarizer

A simple full-stack project that summarizes long articles using a local LLM with Ollama.

## Tech Stack

```text
Frontend: React + Vite
Backend: Java Spring Boot
LLM: Ollama llama3.2
```

## Features

```text
- Paste a long article
- Click Summarize
- Backend sends article to Ollama
- Ollama returns a concise summary
- React displays the result
```

## Project Flow

```text
React Frontend
      ↓
Spring Boot REST API
      ↓
Ollama API
      ↓
llama3.2 Model
      ↓
Summary Response
```

## Backend API

```http
POST http://localhost:8082/api/summarize
```

Request:

```json
{
  "article": "Artificial Intelligence is changing software development..."
}
```

Response:

```json
{
  "summary": "Generated summary here"
}
```

## How to Run

### 1. Start Ollama

```powershell
ollama run llama3.2
```

### 2. Start Backend

```powershell
cd "E:\Git Hub\Article-summarizer\article-summarizer"
.\mvnw.cmd spring-boot:run
```

Backend runs on:

```text
http://localhost:8082
```

### 3. Start Frontend

```powershell
cd "E:\Git Hub\Article-summarizer\article-summarizer-frontend"
npm install
npm run dev
```

Frontend runs on:

```text
http://localhost:5173
```

## What I Learned

```text
- Creating REST APIs using Spring Boot
- Connecting React frontend with Java backend
- Calling Ollama local LLM API from Java
- Handling CORS between frontend and backend
- Using DTOs for request and response data
```
