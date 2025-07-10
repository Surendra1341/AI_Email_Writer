package com.ai.emailwriter;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Service
public class EmailService {


    private final ChatClient chatClient;

    public EmailService(OllamaChatModel chatModel) {
        this.chatClient = ChatClient.create(chatModel);
    }

    public String generateEmailReply(EmailRequest request) {
        String prompt = buildPrompt(request);


        String response = chatClient
                .prompt(prompt)
                .call()
                .content();

        return response;

    }

    private String buildPrompt(EmailRequest request) {
        StringBuilder prompt = new StringBuilder();
        prompt.append("Generate a professional email reply for thr following email content. Please don't generate a subject line and only generate response don't ask or say anything else and don't add name ");
        if(request.getTone() != null && !request.getTone().isEmpty()) {
            prompt.append("Use a ").append(request.getTone()).append(" tone."); ;
        }
        prompt.append("\nOriginal Email :\n").append(request.getEmailContent());
        return prompt.toString();

    }


}
