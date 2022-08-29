package sistema.exception;

public class ValorInvalidoException extends Exception{
    // mensagem de erro + campo + excpetion
    private String nomeCampo = "";
    
    // Sobrecarga de contrutor
    public ValorInvalidoException(String mensagem, Exception origem, String nomeCampo) {
        this(mensagem, origem );                   // this chama construtor da própria classe
        this.nomeCampo = nomeCampo;               // super se refere a superClasse (Pai) Exception
                                                 // super(); chama o contrutor da SuperClasse
            
    }
    public ValorInvalidoException(String mensagem, Exception origem) {
        super(mensagem, origem); // super se refere a superClasse (Pai) Exception
                 // super(); chama o contrutor da SuperClasse
    }

    
}
