package sistema.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import sistema.dao.ClienteDAO;
import sistema.entity.Cliente; 


public class ClienteService {
   // private ArrayList<Cliente> listaClientes = new ArrayList<>();
   private ClienteDAO clienteDAO = new ClienteDAO();

    public ClienteService(){
       /* var cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Zezinho");
        cliente1.setCPF("555.555.555.55");
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2022,05,12);
        cliente1.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente1);

        var cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNome("Luizinho");
        cliente2.setCPF("555.555.555.56");
        calendario.set(2023,05,13);
        cliente2.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente2);

        var cliente3 = new Cliente();
        cliente3.setId(3);
        cliente3.setNome("Huguinho");
        cliente3.setCPF("555.555.555.57");
        calendario.set(2024,05,14);
        cliente3.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente3);

        var cliente4 = new Cliente();
        cliente4.setId(4);
        cliente4.setNome("Tio Patinhas");
        cliente4.setCPF("555.555.555.58");
        calendario.set(2025,05,15);
        cliente4.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente4); */
       
        
    }
   
    public ArrayList<Cliente> getAllClientes(){
        return clienteDAO.getAll();
    }

    public Cliente save(Cliente cliente){
       // listaClientes.add(cliente);
       clienteDAO.save(cliente);
        return cliente;
    }
    public void remove(Cliente cliente) {
        clienteDAO.delete(cliente.getId());
    } 
}
