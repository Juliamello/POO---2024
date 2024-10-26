import java.util.ArrayList;
import java.util.List;

public class Quarto {
    private int numero;
    private String tipo;
    private float preco;
    private boolean estaDisponivel = true;
    private static List<Quarto> listaDeQuartos = new ArrayList<>();


    public Quarto(int numero, String tipo, float preco){
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
        listaDeQuartos.add(this);
    }

    public int getNumero(){
        return this.numero;
    }

    public String getTipo(){
        return this.tipo;
    }

    public Float getPreco(){
        return this.preco;
    }

    public boolean estaDisponivel(){
        if(this.estaDisponivel){
            System.out.println("Está disponível");
            return true;
        } else System.out.println("Está indisponível");
        return false;
    }

    public static List<Quarto> listaDeQuartosDisponiveis(){
        List<Quarto> quartosDisponiveis = new ArrayList<>();
        for(Quarto q : listaDeQuartos){
            if (q.estaDisponivel){
                quartosDisponiveis.add(q);
            }
        }
        return quartosDisponiveis;
    }

    public void reservar(){
        estaDisponivel = false;
    }

    public void liberar(){
        estaDisponivel = true;
    }
}
