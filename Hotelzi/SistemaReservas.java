import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaReservas {

    private List<Hotel> hoteis = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public void adicionarHotel(){
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com o nome e o endereço do hotel");
        String nomeHotel = in.nextLine();
        String enderecoHotel = in.nextLine();
        Hotel hotel = new Hotel(nomeHotel, enderecoHotel);
        hoteis.add(hotel);
    }

    public void listarHoteis(){
        for(Hotel h : hoteis){
            System.out.println("Hotel: " + h.getNome() + "\nEndereço: " + h.getEndereco() + "\n_____________\n");
        }
    }

    public void adicionarQuarto(){
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com o numero, tipo e preco");
        int numeroQuarto = in.nextInt();
        String tipoQuarto = in.next();
        float precoQuarto = in.nextFloat();
        in.nextLine(); 
        Quarto quarto = new Quarto(numeroQuarto, tipoQuarto, precoQuarto);
        System.out.println("Agora entre com o nome do hotel em que deseja adicionar esse quarto");
        String nomeHotel = in.nextLine();
        for(Hotel h : hoteis){
            if(h.getNome() == nomeHotel){
                h.adicionarQuarto(quarto);
            };
        }
    }

    public void listarQuartosDisponiveis(){
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com o nome do Hotel para listar os quartos disponiveis");
        String nomeHotel = in.nextLine();
        for(Hotel h : hoteis){
            if(h.getNome() == nomeHotel){
                h.listarQuartosDisponiveis();
            }
        }
    }

    public void fazerReserva(){
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com o numero da reserva(id) e as informações do cliente(nome, email e telefone) em seguida informações do quarto(numero, tipo e preco) em seguida informações do Hotel(nome, endereço). Após isso entre com as datas de CheckIn e CheckOut");
        int id = in.nextInt();
        in.nextLine();
        String nomeCliente = in.nextLine();
        String emailCliente = in.nextLine();
        String telefoneCliente = in.nextLine();
        int numeroQuarto = in.nextInt();
        in.nextLine();
        String tipoQuarto = in.nextLine();
        float precoQuarto = in.nextFloat();
        String nomeHotel = in.nextLine();
        String enderecoHotel = in.nextLine();
        Reserva reserva = new Reserva(id, nomeCliente, emailCliente, telefoneCliente, numeroQuarto, tipoQuarto, precoQuarto, nomeHotel, enderecoHotel);
        reservas.add(reserva);
    }

    public void cancelarReserva(){
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com o numero da reserva(id)");
        int reservaId = in.nextInt();
        for (Reserva r : reservas){
            if (reservaId == r.getId()){
                r.cancelarReserva();
            }
        }
    }

    public void listarReservasCliente(){
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com o nome do cliente");
        String nomeCliente = in.nextLine();
        for (Reserva r : reservas){
            if (r.getCliente() == nomeCliente){
                System.out.println("Número da reserva: " + r.getId() + "\nHotel: " + r.getHotel() + "\nQuarto: " + r.getQuarto() + "\nCheckInt: " + r.getDataCheckIn() + "\nCheckOut: " + r.getDataCheckOut() + "\n__________________________\n");
            }
        }
    }

}
