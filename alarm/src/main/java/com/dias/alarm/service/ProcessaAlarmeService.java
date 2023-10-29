package com.dias.alarm.service;

import com.dias.alarm.dataaccess.command.AlarmeCommandDataAccess;
import com.dias.alarm.domain.HistoricoAlarme;
import com.dias.alarm.record.HistoricoDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class ProcessaAlarmeService {

    private final AlarmeCommandDataAccess alarmeCommandDataAccess;

    public ProcessaAlarmeService(AlarmeCommandDataAccess alarmeCommandDataAccess) {
        this.alarmeCommandDataAccess = alarmeCommandDataAccess;
    }

    public String execute(String dadosAlarme){
        if(verificaChamada(dadosAlarme)){
            return "Chamada inválida";
        }
        HistoricoAlarme acionamentoSalvo = this.alarmeCommandDataAccess.saveAcionamentoAlarme(new HistoricoAlarme(LocalDateTime.now()));
        return converteDto(acionamentoSalvo).toString();
    }
    private Boolean verificaChamada(String dadosAlarme){
        return Objects.isNull(dadosAlarme);
    }
    private HistoricoDto converteDto(HistoricoAlarme historicoAlarme){
        return new HistoricoDto(historicoAlarme.getDateTime());
    }
}
