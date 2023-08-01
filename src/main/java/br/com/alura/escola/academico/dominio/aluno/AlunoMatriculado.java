package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.eventos.Evento;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.eventos.TiposDeEventos;

import java.time.LocalDateTime;
import java.util.Map;

public class AlunoMatriculado implements Evento {

    private final CPF cpf;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpf) {
        this.cpf = cpf;
        momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return this.momento;
    }

    @Override
    public TiposDeEventos tipo() {
        return TiposDeEventos.ALUNO_MATRICULADO;
    }

    @Override
    public Map<String, Object> informacoes() {
        return Map.of("cpf", cpf);
    }

    public CPF getCpf() {
        return cpf;
    }
}
