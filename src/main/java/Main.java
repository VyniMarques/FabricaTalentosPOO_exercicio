import Model.Museu;
import Model.Tema;
import Model.Visitantes.Visitante;
import Model.Visitantes.VisitantePremium;

public class Main {
    public static void main(String[] args) {

        Museu museu = new Museu();

        Tema t1 = new Tema("Vintage",135);
        Tema t2 = new Tema("Numismática",300);
        Tema t3 = new Tema("História da Música",67);
        Tema t4 = new Tema("Pinturas",72);
        Tema t5 = new Tema("Esculturas",46);

        museu.addTema(t1);
        museu.addTema(t2);
        museu.addTema(t3);
        museu.addTema(t4);
        museu.addTema(t5);

        VisitantePremium v1 = new VisitantePremium("Vinicius","123456-0",2000, 1, 6,1);
        VisitantePremium v2 = new VisitantePremium("Claudio","654321-0",2002,07,22,2);
        Visitante v3 = new Visitante("Caio","135790-1",2000, 4, 20,3);
        Visitante v4 = new Visitante("Tiago","221133-1",2000,3,13,4);
        Visitante v5 = new Visitante("Igor","098754-4",1999,5,2,5);

        v1.retornaTema(museu);
        v1.retornaItens(museu);
        System.out.println(" ");
        v2.retornaTema(museu);
        v2.retornaItens(museu);
        System.out.println(" ");
        v3.retornaTema(museu);
        v3.retornaItens(museu);
        System.out.println(" ");
        v4.retornaTema(museu);
        v4.retornaItens(museu);
        System.out.println(" ");
        v5.retornaTema(museu);
        v5.retornaItens(museu);
        System.out.println(" ");
        v1.usarValeRefeicao(30);
        v1.retornaSaldo();
        System.out.println(" ");
        v2.retornaSaldo();

    }
}
