package sistema.view;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import sistema.controller.ListagemClienteController;
import sistema.entity.Cliente;
import sistema.model.TabelaClienteModel;
import java.awt.FlowLayout;

public class ListagemCliente extends JFrame {


    private JScrollPane jpnCentro;
    private JPanel jpnSul = new JPanel();
    private JButton btnNovo = new JButton("Novo");
    private JButton btnAlterar = new JButton("Alterar");
    private JButton btnExcluir = new JButton("Excluir");
    private ListagemClienteController controller = new ListagemClienteController(this);

    private TabelaClienteModel tabelaModel = new TabelaClienteModel(controller);
    private JTable tabela = new JTable(tabelaModel); // ela que desenha a tabela
    
 public ListagemCliente() {
     setSize(500,400);
     setTitle(" Listagem de Clientes "); // nome da tela
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     criaPaineis(); // chama o metodo!!!!
     setVisible(true);
 }
 public Cliente getCliente(){
    if(tabela.getSelectedRow() > 0) 
        return controller.getAllClientes().get(tabela.getSelectedRow());
    
    return null;
}

    public void atualizatabela(){
        tabelaModel.fireTableDataChanged();
    }
    public void atualizaTabela(){
        tabelaModel.fireTableDataChanged();
    }
    private void criaPaineis(){
        //import java.awt.FlowLayout; IMPORT PARA ESQUERDA OU DIREITA
        jpnSul.setLayout(new FlowLayout(FlowLayout.LEFT)); // DEIXANDO OS BOTÕES PARA A ESQUERDA 
        
        add(jpnSul, "South");
        jpnSul.add(btnNovo);
        jpnSul.add(btnAlterar);
        jpnSul.add(btnExcluir);

        btnNovo.addActionListener(controller);
        btnNovo.setName("btnNovo");
        btnAlterar.addActionListener(controller);
        btnAlterar.setName("btnAlterar");
        btnExcluir.addActionListener(controller);
        btnExcluir.setName("btnExcluir");

    
        
        

        jpnCentro = new JScrollPane(tabela);
        
        jpnCentro.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jpnCentro.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        

        add(jpnCentro, "Center");
    } 

}

    

