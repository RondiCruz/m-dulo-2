package introducao.avaliacao20;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Pessoa {

    private String nome;
    private String dataNascimento;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String string) {
        this.dataNascimento = string;
    }

    
    
}
