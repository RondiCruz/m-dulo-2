package introducao.exercicio14;

import java.util.ArrayList;

public class ListaTarefas {

    private ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void setListaTarefas(ArrayList<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }

  /*  public float calculaTempoTotal(){
        float total = 0;
        
        for(var umaTarefa : listaTarefas){
            total = total + umaTarefa.getTipo().getTempo();

        }
        return total; */

    public  float calculaTempoTotal(){
        float total = 0;
        for(int i=0; i < getListaTarefas().size(); i++ ){
            total = total + getListaTarefas().get(i).getTipo().getTempo();
        }
        return total;  
    }
  
    
    public static void main(String[] args) {

        ListaTarefas lista1 = new ListaTarefas();

        Tarefa tar1 = new Tarefa();
        tar1.setNome("Passear");
        lista1.getListaTarefas().add(tar1);

        Tarefa tar2 = new Tarefa();
        tar2.setNome("Pescar");
        lista1.getListaTarefas().add(tar2);

        Tarefa tar3 = new Tarefa();
        tar3.setNome("Fazer compras");
        lista1.getListaTarefas().add(tar3);

        Tarefa tar4 = new Tarefa();
        tar4.setNome("Estudar");
        lista1.getListaTarefas().add(tar4);

        Tarefa tar5 = new Tarefa();
        tar5.setNome("Trabalhar");
        lista1.getListaTarefas().add(tar5);

        Tarefa tar6 = new Tarefa();
        tar6.setNome("Aprender Orientação a Objetos");
        lista1.getListaTarefas().add(tar6);

        TipoTarefa tipo1 = new TipoTarefa();
        tipo1.setNome("Fácil");
        tipo1.setTempo(10);

        TipoTarefa tipo2 = new TipoTarefa();
        tipo2.setNome("Medio");
        tipo2.setTempo(15);

        TipoTarefa tipo3 = new TipoTarefa();
        tipo3.setNome("Dificil");
        tipo3.setTempo(20);

        
        tar1.setTipo(tipo1);
        tar2.setTipo(tipo1);

        tar3.setTipo(tipo2);
        tar4.setTipo(tipo2);

        tar5.setTipo(tipo3);
        tar6.setTipo(tipo3);

        float guardar = lista1.calculaTempoTotal();
        System.out.println(guardar);











        
    }

    
    
}
