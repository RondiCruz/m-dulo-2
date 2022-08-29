package introducao.exercicio18;

import java.util.ArrayList;

public class Setor {


    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    private String nome;
    
   
    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }
    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
