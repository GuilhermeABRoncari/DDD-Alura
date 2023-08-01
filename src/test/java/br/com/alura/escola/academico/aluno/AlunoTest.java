package br.com.alura.escola.academico.aluno;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.academico.dominio.aluno.Email;
import br.com.alura.escola.academico.dominio.aluno.Telefone;
import br.com.alura.escola.academico.dominio.aluno.exceptions.MaxTelefoneException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void naoDeveriaPermitirCadastroAcimaDeDoisNumerosDeTelefonePorAluno() {
        Aluno aluno = new Aluno(new CPF("123.456.789-00"), "Fulano", new Email("fulano@email.com"));

        Telefone primeiroTelefone = new Telefone("00", "00000000");
        Telefone segundoTelefone = new Telefone("11", "11111111");
        Telefone terceiroTelefone = new Telefone("22", "22222222");

        assertThrows(MaxTelefoneException.class, () -> {
            aluno.adicionarTelefone(primeiroTelefone.getDdd(), primeiroTelefone.getNumero());
            aluno.adicionarTelefone(segundoTelefone.getDdd(), segundoTelefone.getNumero());
            aluno.adicionarTelefone(terceiroTelefone.getDdd(), terceiroTelefone.getNumero());
        });
    }

}