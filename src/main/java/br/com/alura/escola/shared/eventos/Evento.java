package br.com.alura.escola.shared.eventos;

import java.time.LocalDateTime;
import java.util.Map;

public interface Evento {

    LocalDateTime momento();
    TiposDeEventos tipo();
    Map<String, Object> informacoes();

}
