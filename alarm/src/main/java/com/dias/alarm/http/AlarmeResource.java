package com.dias.alarm.http;

import com.dias.alarm.service.ProcessaAlarmeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alarme")
public class AlarmeResource {

    private final ProcessaAlarmeService processaAlarmeService;

    public AlarmeResource(ProcessaAlarmeService processaAlarmeService) {
        this.processaAlarmeService = processaAlarmeService;
    }

    @PostMapping("/trigger")
    public ResponseEntity<String> handleAlarmTrigger(@RequestBody String alarmData) {
        String resultado = processaAlarmeService.execute(alarmData);
        return ResponseEntity.ok(resultado);
    }

    @GetMapping
    public ResponseEntity<String> testeFuncionamento(){
        return ResponseEntity.ok("Hello World");
    }
}
