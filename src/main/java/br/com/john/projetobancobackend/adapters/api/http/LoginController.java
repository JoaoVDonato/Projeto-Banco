package br.com.john.projetobancobackend.adapters.api.http;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/bank")
public class LoginController {

    @PostMapping("/register")
    public ResponseEntity registerUser() {
        return ResponseEntity.ok(null);
    }


    public ResponseEntity loginUser() {
        return ResponseEntity.ok(null);
    }

}