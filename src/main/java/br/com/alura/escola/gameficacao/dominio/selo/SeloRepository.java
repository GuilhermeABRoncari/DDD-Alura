package br.com.alura.escola.gameficacao.dominio.selo;

import br.com.alura.escola.shared.dominio.CPF;

import java.util.List;

public interface SeloRepository {

    void adicionar(Selo selo);

    List<Selo> encontraSelosDoAluno(CPF cpfDoAluno);

}
