package introducao.exercicio3;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class App6 {
    public static void main(String[] args) {

        Comprador zezinho = new Comprador();
        zezinho.setId(300);
        zezinho.setNome("Zezinho da Silva");
        zezinho.setEndereco("Rua lalala 100");

        Comprador elon  = new Comprador();
        elon.setId(300);
        elon.setNome(" Elon Musk ");
        

        Pedido pedido1 = new Pedido();
        pedido1.setId(1);
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(2022, 04, 29);
        pedido1.setDataPedido(calendar.getTime());
        pedido1.setCliente(zezinho);

        Pedido pedido2 = new Pedido();
        pedido2.setId(2);
        

        var produto1 = new Produto();
        produto1.setId(1001);
        produto1.setNome("Playstation 5");
        produto1.setValor(8000f);

        var produto2 = new Produto();
        produto2.setId(1002);
        produto2.setNome("Xbox Series X");
        produto2.setValor(5000f);

        var produto3 = new Produto();
        produto3.setId(1003);
        produto3.setNome("Celular");
        produto3.setValor(2000f);

        var produto4 = new Produto();
        produto4.setId(1004);
        produto4.setNome("Notebook");
        produto4.setValor(3000f);

        var produto5 = new Produto();
        produto5.setId(1005);
        produto5.setNome("Impressora");
        produto5.setValor (1000f);

        var item1 = new ItemPedido();
        item1.setId(1);
        item1.setQuantidade(1);
        item1.setValorVenda(7500f);
        item1.setProduto(produto1);// ligacão entre ItemPedido e Produto
        pedido1.getListaItens().add(item1);// Ligacão entre Pedido e Item pedido

        var item2 = new ItemPedido();
        item2.setId(2);
        item2.setQuantidade(1);
        item2.setValorVenda(4000f);
        item2.setProduto(produto2);
        pedido1.getListaItens().add(item2);

        var item3 = new ItemPedido();
        item3.setId(3);
        item3.setQuantidade(1);
        item3.setValorVenda(3000f);
        item3.setProduto(produto3);
        pedido2.getListaItens().add(item3);

        

        var result = pedido1.calcValorTotal();
        System.out.println(String.format("O Total do pedido e: %.2f"  , result)); // duas casa depois da virgula .2


        

        

        
        
    }
    
}
