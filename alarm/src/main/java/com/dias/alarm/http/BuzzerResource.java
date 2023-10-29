package com.dias.alarm.http;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buzzer")
public class BuzzerResource {

    @PostMapping("/activate")
    public ResponseEntity<String> activateBuzzer() {
        // Código para acionar o buzzer no dispositivo
        // Envie o comando para o dispositivo aqui

        // Retorne uma resposta adequada
        return ResponseEntity.ok("Buzzer acionado com sucesso");
    }
}
