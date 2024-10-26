import java.sql.Date;

public class Reserva {
    private int id;
    private Cliente cliente;
    private Quarto quarto;
    private Hotel hotel;
    private Date dataCheckIn;
    private Date dataCheckOut;

    public Reserva(int id, String nome, String email, String telefone, int numero, String tipo, float preco, String nomeHotel, String enderecoHotel){
        this.id = id;
        this.cliente = new Cliente(nome, email, telefone);
        this.quarto = new Quarto(numero, tipo, preco);
        this.hotel = new Hotel(nomeHotel, enderecoHotel);
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }

    public int getId(){
        return this.id;
    }

    public String getCliente(){
        return cliente.getNome();
    }

    public int getQuarto(){
        return quarto.getNumero();
    }

    public String getHotel(){
        return hotel.getNome();
    }

    public Date getDataCheckIn(){
        return dataCheckIn;
    }

    public Date getDataCheckOut(){
        return this.dataCheckOut;
    }

    public void confirmaReserva(){
        quarto.reservar();
    }

    public void cancelarReserva(){
        quarto.liberar();
    }
}
