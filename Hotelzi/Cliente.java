public class Cliente {
    private String nome;
    private String email;
    private String telefone;

    public Cliente(String nome, String email, String telefone){
        this.nome = nome;
        this. email = email;
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void fazerReserva(){

    }

    public void cancelarReserva(){

    }
}
