package Model.Visitantes;

import Model.Museu;
import Model.Tema;

import java.util.ArrayList;
import java.util.Date;

public class Visitante {

    public String nome;
    public String cpf;
    public Date dataNascimento;
    public int codTema;

    public Visitante(String nome, String cpf, int ano, int mes, int dia, int codTema) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = new Date(ano, mes, dia);
        this.codTema = codTema;
    }

    public void retornaTema(Museu museu) {
        ArrayList<Tema> temas = museu.getTemas();
        for (int i = 0; i < Tema.codigo; i++) {
            if (i+1 == this.codTema){
                System.out.println(this.nome + " visitou "+ temas.get(i).getNome());
            }
        }
    }

    public void retornaItens(Museu museu) {
        ArrayList<Tema> temas = museu.getTemas();
        for (int i = 0; i < Tema.codigo; i++) {
            if (i + 1 == this.codTema) {
                System.out.println(this.nome + " contou " + temas.get(i).getItens_expostos() + " itens");
            }
        }
    }
}
