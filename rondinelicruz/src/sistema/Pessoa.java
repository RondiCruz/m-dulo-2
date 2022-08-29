package sistema;

public class Pessoa {
    // Atributos (váriaveis) automaticamente inicializados com o valor padrão
    //escopo de vida de instancia
    //ENCAPSULAMENTO = Eesconder dados ( Proteger )
    //POJO - Plain old Java object
    private String nomeCompleto;
    private int idade;
    private String CPF;
    private  float altura;
    private static String raca; // estatico

    public static void mostraRaca(){
        System.out.println(raca);
    }
    
    
     public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    //GETTER E SETTER
     // RETURN devolve - VOID encerra
     public String getNome(){
         return this.nomeCompleto;
     }
     public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome){
        if(!nome.equals("")){
            this.nomeCompleto = nome;  
        }
         
     }
    //comportamento
    //CONSTRUTOR - inicializar um objeto e definir valores obrigatórios
    public Pessoa(String nome){
        System.out.println("CONSTRUTOR:" + nome);
        // this.nomeCompleto = nome;
        setNome(nome);
    }
    //metodo(função)
    //assinatura de um método
    // modificadordracesso tipoderetorno nomedometodo (parametros) {corpo}
    public String podeDirigir(){
        if(this.idade >= 18){
            return "Pode Dirigir";

        }else{
            return "Não pode dirigir";
        }

    }
    public void mostraCPF(){
        System.out.println(this.CPF);
    }
    
}
