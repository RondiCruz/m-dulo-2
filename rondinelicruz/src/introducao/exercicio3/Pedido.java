package introducao.exercicio3; // 3

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private long id;
    private Date dataPedido;
    private Comprador cliente; // pedido comprador
    private ArrayList<ItemPedido> listaItens = new ArrayList<>(); // itemPedido -  get set
    

    public ArrayList<ItemPedido> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemPedido> listaItens) {
        this.listaItens = listaItens;
    }

    public Comprador getCliente() {
        return cliente;
    }

    public void setCliente(Comprador cliente) {
        this.cliente = cliente;
    }

    public float calcValorTotal(){
        // para cada umItem dentro de listagens -> pega o cara e entra no bloco
        float valorTotal = 0;
        for(ItemPedido umItem : listaItens){  
            var valorItem = umItem.getQuantidade() * umItem.getValorVenda();
            valorTotal += valorItem;
            //valorTotal = valorTotal + valorItem;
        }
        return valorTotal;
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getDataPedido() {
        return dataPedido;
    }
    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    

    
}
