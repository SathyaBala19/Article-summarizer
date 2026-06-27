import { useState } from "react";
import "./App.css";

function App() {
  const [article, setArticle] = useState("");
  const [summary, setSummary] = useState("");

  const summarizeArticle = async () => {
    const response = await fetch("http://localhost:8082/api/summarize", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ article: article }),
    });

    const data = await response.json();
    setSummary(data.summary);
  };

  return (
    <div>
      <h1>Article Summarizer</h1>

      <textarea
        rows="10"
        cols="60"
        placeholder="Paste your article here..."
        value={article}
        onChange={(e) => setArticle(e.target.value)}
      />

      <br />

      <button onClick={summarizeArticle}>Summarize</button>

      <h2>Summary</h2>
      <p>{summary}</p>
    </div>
  );
}

export default App;