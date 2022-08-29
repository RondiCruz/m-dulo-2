package introducao.avaliacao1;

import java.util.ArrayList;

public class Construtor extends Colaborador{

    private ArrayList<Construtor> listaConstrutores = new ArrayList<>();
    

    public ArrayList<Construtor> getListaConstrutores() {
        return listaConstrutores;
    }

    public void setListaConstrutores(ArrayList<Construtor> listaConstrutores) {
        this.listaConstrutores = listaConstrutores;
    }

    private boolean terceirizado;

    public boolean isTerceirizado() {
        return terceirizado;
    }

    public void setTerceirizado(boolean terceirizado) {
        this.terceirizado = terceirizado;
    }

    
    
}
