package br.com.alura.escola.academico.dominio.aluno.exceptions;

public class MaxTelefoneException extends RuntimeException{

    private static final String MESSAGE = "Este aluno não pode ter mais do que dois telefones cadastrados";

    public MaxTelefoneException() {
        super(MESSAGE);
    }
}
