package br.com.alura.escola.gameficacao.aplicacao;

import br.com.alura.escola.gameficacao.dominio.selo.Selo;
import br.com.alura.escola.gameficacao.dominio.selo.SeloRepository;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.eventos.Evento;
import br.com.alura.escola.shared.eventos.Ouvinte;
import br.com.alura.escola.shared.eventos.TiposDeEventos;

public class GeradorDeSeloAlunoNovato extends Ouvinte {

    private final SeloRepository repository;

    public GeradorDeSeloAlunoNovato(SeloRepository repository) {
        this.repository = repository;
    }

    @Override
    protected void reageAo(Evento evento) {
        CPF cpfDoAluno = (CPF) evento.informacoes().get("cpf");
        Selo novato = new Selo(cpfDoAluno, "Novato");

        repository.adicionar(novato);
        System.out.println(String.format("Aluno com %s recebeu o selo: %s", cpfDoAluno, novato.getNomeDoSelo()));
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo().equals(TiposDeEventos.ALUNO_MATRICULADO);
    }

}
