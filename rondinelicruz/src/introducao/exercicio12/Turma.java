package introducao.exercicio12;

import java.util.ArrayList;

public class Turma {

    private ArrayList<Crianca> listaCrianca = new ArrayList<>();

    public ArrayList<Crianca> getListaCrianca() {
        return listaCrianca;
    }

    public void setListaCrianca(ArrayList<Crianca> listaCrianca) {
        this.listaCrianca = listaCrianca;
    }

    private String serie;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;

    }

    public int contaMeninos(){
        int contador = 0;
        for(Crianca umaCrianca : listaCrianca){
            if(umaCrianca.getSexo().equalsIgnoreCase("Masculino")){
                contador = contador  + 1;
                //contador++;
                //contador+=1;
            }
        }
        return contador;
    }
    public int contaMeninas(){
        int contador = 0;
        for(Crianca umaCrianca : listaCrianca){
            //if(umaCrianca.getSexo().toUpperCase().equals("FEMININO")){}
            if(umaCrianca.getSexo().toLowerCase().equals("feminino")){
                contador += 1;
            }
        }
        return contador ;

    }      
            
                 
    public static void main(String[] args) {

        Turma turma1 = new Turma();
        turma1.setSerie("5 série");

        Crianca crianca1 = new Crianca();
        crianca1.setNome("Zezinho");
        crianca1.setSexo("Masculino");
        turma1.getListaCrianca().add(crianca1);

        Crianca crianca2 = new Crianca();
        crianca2.setNome("Mariazinha");
        crianca2.setSexo("feminino");
        turma1.getListaCrianca().add(crianca2);

        Crianca crianca3 = new Crianca();
        crianca3.setNome("Aninha");
        crianca3.setSexo("Feminino");
        turma1.getListaCrianca().add(crianca3);

        Crianca crianca4 = new Crianca();
        crianca4.setNome("Julinha");
        crianca4.setSexo("Feminino");
        turma1.getListaCrianca().add(crianca4);


        var numMeninos = turma1.contaMeninos();
        System.out.println(numMeninos);

        var numMeninas = turma1.contaMeninas();
        System.out.println(numMeninas); 



         

    }

    
    
}
