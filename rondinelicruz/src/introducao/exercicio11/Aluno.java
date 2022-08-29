package introducao.exercicio11;

import java.util.ArrayList;

public class Aluno {

    private ArrayList<Nota> listaNotas = new ArrayList<>();

    public float calcMediaNotas(){
        float soma = 0;
        float media = 0;
        //size() retorna o numero de itens no ArrayList
        for (int i=0;i<listaNotas.size();i++){
        soma = soma + getListaNotas().get(i).getValor();

        } // Sair do For para fazer a media
       
        media = soma / listaNotas.size();
        return media;
    }
    

    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }


    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Zezinho da Silva");

        Nota nota1 = new Nota();
        nota1.setValor(5);
        aluno1.getListaNotas().add(nota1);

        Nota nota2 = new Nota();
        nota2.setValor(7);
        aluno1.getListaNotas().add(nota2);

        Nota nota3 = new Nota();
        nota3.setValor(6);
        aluno1.getListaNotas().add(nota3);

        /* zezinho.getListaNotas().add(nota1);
           zezinho.getListaNotas().add(nota2);
           zezinho.getListaNotas().add(nota3); */


        
        float guardar = aluno1 .calcMediaNotas();
        System.out.println(guardar);
        
        
        

    }
    
}
