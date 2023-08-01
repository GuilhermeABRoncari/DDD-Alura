package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.eventos.Evento;
import br.com.alura.escola.shared.eventos.Ouvinte;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoMatriculado extends Ouvinte {

    public void reageAo(Evento evento) {
        String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(String.format("Aluno com CPF: %s , foi matriculado em: %s", ((AlunoMatriculado) evento).getCpf(), momentoFormatado));
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
