package introducao.exercicio5;

import java.util.ArrayList;

public class Agenda {

    private long id;
    private ArrayList<Agendamento> listaAgendamentos =  new ArrayList<>();
    private Medico medico;
        
        

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public ArrayList<Agendamento> getListaAgendamentos() {
        return listaAgendamentos;
    }

    public void setListaAgendamentos(ArrayList<Agendamento> listaAgendamentos) {
        this.listaAgendamentos = listaAgendamentos;
    }

    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void imprimirAgenda() {
        System.out.println("AgendaID:" + getId());
        System.out.println("MedicoID:" + getMedico().getId());
        System.out.println("MedicoID:" + getMedico().getNome());
        System.out.println("MedicoID:" + getMedico().getCRM());
        for(var umAgendamento : this.getListaAgendamentos()){
        System.out.println("->Agendamento ID:" + umAgendamento.getId());
        System.out.println("->Agendamento Data/Hora:" + umAgendamento.getDataHora());
        System.out.println("->Paciente ID:" + umAgendamento.getPaciente().getId());
         System.out.println("->Paciente Nome:" + umAgendamento.getPaciente().getNome());
        System.out.println("->Paciente Tel:" + umAgendamento.getPaciente().getTelefone());
         

        }
    }
     

    
}
