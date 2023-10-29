package com.dias.alarm.record;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HistoricoDto {
    private LocalDateTime localDateTime;

    @Override
    public String toString() {
        return "Acionamento do alarme com a data: " + super.toString();
    }
}
