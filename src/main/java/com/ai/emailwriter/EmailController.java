package com.ai.emailwriter;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin("*")
public class EmailController {

    private EmailService emailService;


    //mutation observer
    // 1. when composed window added
    //2.  url changes -> email mai agr reply mai compose kre to page reload -> X   = url changes

    //  /api/email/generate
    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest request) {

        String response = emailService.generateEmailReply(request);
        return ResponseEntity.ok(response);
    }

}
