package introducao.avaliacao20;

import java.util.ArrayList;

public class Curriculo {

    private Pessoa pessoa;

    private ArrayList<Formacao> listaFormacoes =  new ArrayList<>();

    private ArrayList<ExperienciaProfissional> listaExperienciasProfissionais =  new ArrayList<>();

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ArrayList<Formacao> getListaFormacoes() {
        return listaFormacoes;
    }

    public void setListaFormacoes(ArrayList<Formacao> listaFormacoes) {
        this.listaFormacoes = listaFormacoes;
    }

    public ArrayList<ExperienciaProfissional> getListaExperienciasProfissionais() {
        return listaExperienciasProfissionais;
    }

    public void setListaExperienciasProfissionais(ArrayList<ExperienciaProfissional> listaExperienciasProfissionais) {
        this.listaExperienciasProfissionais = listaExperienciasProfissionais;
    }

    public String gerarCurriculo(){
        StringBuilder montador = new StringBuilder();
        montador.append("Pessoa Nome: " + getPessoa().getNome() + "\n");
        montador.append("Pessoa Data Nasc: " + getPessoa().getDataNascimento() + "\n");
        for(var umaFormacao : getListaFormacoes()){
             montador.append("Formacao Nome: " + umaFormacao.getNome() + "\n");
             montador.append("Formacao Ano Conclusao: " + umaFormacao.getAnoConclusao() + "\n");
            }   
            for(var umaExperienciaProfissional : getListaExperienciasProfissionais()){
                montador.append("Exp Prof Nome: " + umaExperienciaProfissional.getNome() + "\n");
                montador.append("Exp Prof Ano Conclusao: " + umaExperienciaProfissional.getAnoConclusao() + "\n");
                }
        return montador.toString();
    }

    public int contarNumExperienciasProfissionais(){
        int contador = 0;
        for(var umaExperienciaProfissional : listaExperienciasProfissionais){
             umaExperienciaProfissional.getNome();
             contador++;
        }
        return contador;
        
          
        
    }  
        
}          
    
        
        
         
            
    

