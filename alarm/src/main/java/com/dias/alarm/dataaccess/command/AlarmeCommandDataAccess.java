package com.dias.alarm.dataaccess.command;

import com.dias.alarm.domain.HistoricoAlarme;
import com.dias.alarm.repository.AlarmeRepository;
import org.springframework.stereotype.Service;

@Service
public class AlarmeCommandDataAccess {
    private final AlarmeRepository alarmeRepository;

    public AlarmeCommandDataAccess(AlarmeRepository alarmeRepository) {
        this.alarmeRepository = alarmeRepository;
    }
    public HistoricoAlarme saveAcionamentoAlarme(HistoricoAlarme historicoAlarme){
        return this.alarmeRepository.save(historicoAlarme);
    }
}
