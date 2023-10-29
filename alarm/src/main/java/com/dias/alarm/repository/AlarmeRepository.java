package com.dias.alarm.repository;

import com.dias.alarm.domain.HistoricoAlarme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AlarmeRepository extends JpaRepository<HistoricoAlarme, Long> {
}
