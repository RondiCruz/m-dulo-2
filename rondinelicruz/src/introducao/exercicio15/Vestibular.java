package introducao.exercicio15;

import java.util.ArrayList;

public class Vestibular {

    private ArrayList<Vestibulando> listaVestibulandos = new ArrayList<>();
    // append adicionar no fim
    public String gerarListaAprovados(){
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("Aprovados" );
         //  StringBuilder montadorString = new StringBuilder();
        // for(var umvestibulando : listaVestibulandos){
        // if(umVestibulando.get.nota() >= 7)
        // montadorTexto.append("nome:" + umVestibulando.getNome() + "\n");
        
        for(int i=0; i< listaVestibulandos.size(); i++){
            Vestibulando vest1 = listaVestibulandos.get(i);
            if(vest1.getNota() >= 7){
                montadorString.append(vest1.getNome() );
            }
            
        }
        return montadorString.toString();

    }

    public ArrayList<Vestibulando> getListaVestibulandos() {
        return listaVestibulandos;
    }

    public void setListaVestibulandos(ArrayList<Vestibulando> listaVestibulandos) {
        this.listaVestibulandos = listaVestibulandos;
    }
    

     public static void main(String[] args) {
         
        Vestibular acafe = new Vestibular();

        Vestibulando vest1 = new Vestibulando();
        vest1.setNome("Zezinho");
        vest1.setNota(7f);
        acafe.getListaVestibulandos().add(vest1);
        
        

        Vestibulando vest2 = new Vestibulando();
        vest2.setNome("Pedrinho");
        vest2.setNota(5f);
        acafe.getListaVestibulandos().add(vest2);

        Vestibulando vest3 = new Vestibulando();
        vest3.setNome("Huguinho");
        vest3.setNota(10f);
        acafe.getListaVestibulandos().add(vest3);

        Vestibulando vest4 = new Vestibulando();
        vest4.setNome("Luizinho");
        vest4.setNota(8f);
        acafe.getListaVestibulandos().add(vest4);

       String  retorno = acafe.gerarListaAprovados();
       System.out.println(retorno);



     }
     
    
}
