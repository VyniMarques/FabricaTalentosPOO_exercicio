package Model.Visitantes;

import java.util.Date;

public class VisitantePremium extends Visitante{

    public double saldo = 100;
    public static int numeroVale = 1;
    public double gasto;

    public VisitantePremium(String nome, String cpf, int ano, int mes, int dia, int codTema) {
        super(nome, cpf, ano, mes, dia, codTema);
        numeroVale++;
    }


    public void usarValeRefeicao(double valor){
        if(valor <= saldo){
            System.out.println(this.nome + " usou o vale");
            saldo = saldo - valor;
            gasto = gasto + valor;
            System.out.println("Valor restande do vale: R$" + saldo);
        }else{
            System.out.println("Vale insuficiente");
        }
    }

    public void retornaSaldo(){
        System.out.println("Vale de " + this.nome);
        System.out.println("Total gasto: R$" + gasto);
        System.out.println("Saldo não utilizado: R$" + saldo);
        saldo = 0;
    }

}
