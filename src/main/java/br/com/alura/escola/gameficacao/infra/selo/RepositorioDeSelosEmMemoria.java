package br.com.alura.escola.gameficacao.infra.selo;

import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.gameficacao.dominio.selo.SeloRepository;
import br.com.alura.escola.gameficacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements SeloRepository {

    List<Selo> selos = new ArrayList<>();

    @Override
    public void adicionar(Selo selo) {
        selos.add(selo);
    }

    @Override
    public List<Selo> encontraSelosDoAluno(CPF cpfDoAluno) {
        return selos.stream().filter(selo -> selo.getCpfDoAluno().equals(cpfDoAluno)).collect(Collectors.toList());
    }
}
