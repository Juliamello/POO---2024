import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private String endereco;
    private List<Quarto> listaDeQuartos;

    public Hotel(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.listaDeQuartos = new ArrayList<>();
    }

    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void adicionarQuarto(Quarto quarto){
        listaDeQuartos.add(quarto);
    }

    public void removerQuarto(Quarto quarto){
        listaDeQuartos.remove(quarto);
    }
    
    public void listarQuartosDisponiveis(){
        System.out.println("Quartos disponiveis no Hotel " + this.nome + ": ");
        for(Quarto q : listaDeQuartos){
            if (q.estaDisponivel()){
                System.out.println("Quarto número: " + q.getNumero());
            }
        }
    }

}
