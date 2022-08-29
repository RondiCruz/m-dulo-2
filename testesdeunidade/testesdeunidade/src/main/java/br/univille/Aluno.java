package br.univille;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private float percFrequencia;
    private ArrayList<Avaliacao> listaNotas = new ArrayList<>();

    
   
    public ArrayList<Avaliacao> getListaNotas() {
        return listaNotas;
    }
    public void setListaNotas(ArrayList<Avaliacao> listaNotas) {
        this.listaNotas = listaNotas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPerFrequencia() {
        return percFrequencia;
    }
    public void setPerFrequencia(float perFrequencia) {
        this.percFrequencia = perFrequencia;
    }
    private float calcMedia(){
        float soma = 0;
        float media = 0;

        for(var umaAvaliacao : listaNotas){
            soma += umaAvaliacao.getNota();
        }
        
        /*
        for(int i=0; i< listaNotas.getSize();i++){
            var umaAvaliacao listaNotas.get(i);
            soma = soma + umaAvaliacao.getNota();
        }
        */
        media = soma / listaNotas.size();

        return media;
    }

    public boolean estaEmExame(){
        var media = calcMedia();
        
        if (percFrequencia >= 75 && (media > 3 && media < 7)){
            return true;
        }
        return false;
    }

    public boolean estaAprovado(){
        var media = calcMedia();
        if (percFrequencia >= 75 &&  (media >= 7)){
            return true;
        }
        return false;
    }

    public boolean estareprovado(){
        var media = calcMedia();
        if (percFrequencia < 75 || media <=3){
            return true;
        }
        return false;
    }
    public Object estaReprovado() {
        return null;
    }

    
    
}
