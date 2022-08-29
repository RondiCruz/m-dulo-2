package introducao.exercicio4;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class App7 {
    public static void main(String[] args) {
       // Instanciando a classe funcionário e a classe cliente
        Funcionario funcionario1 = new Funcionario(); 
        EmpresaCliente empresa1 = new EmpresaCliente();

        funcionario1.setCPF("555.555.555.55"); //  (Set) Setamos atribuimos valor
        funcionario1.setFuncao("Atendimento");
        funcionario1.setId(1010);
        funcionario1.setNome("Zezinho");
        funcionario1.setTelefone("5555-5555");
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2000,05,10);
        funcionario1.setDataNascimento(calendario.getTime());

        empresa1.setNome("Tio Patinhas Corporation");
        empresa1.setCNPJ("999.999.0001.99");
        empresa1.setMarca("Dinheiro");
        empresa1.setTelefone("5555-6666");
        empresa1.setNumFuncionarios(10);
        calendario.set(2022,05,10);
        empresa1.setDataCriacao(calendario.getTime());
        //o valor de funcionario1. Imprima em tela os atributos que são visiveis.
        // POLIMOFISMO - POLI - MORFISMOS - FORMAS DE EXISTIR
        PessoaFisica pessoal = funcionario1;
        System.out.println(pessoal.getDataNascimento());
        System.out.println(pessoal.getCPF());
        System.out.println(pessoal.getNome());
        System.out.println(pessoal.getTelefone());
        // 3) Crie uma variavel pessoa2:PessoaJuridica e
        PessoaJuridica pessoa2; 
        // atribua o valor de empresa1.Imprima
        pessoa2 = empresa1;
        //tela os atributos que são visiveis.
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getTelefone());
        System.out.println(pessoa2.getDataCriacao());
        System.out.println(pessoa2.getCNPJ());

        //4) Crie uma variavel pessoa3:Pessoa e
        introducao.exercicio4.Pessoa pessoa3;
        //atribua o valor de pessoa1.Imprima
        pessoa3 = funcionario1;
        //em tela os atributos que são visiveis.
        System.out.println(pessoa3.getNome());
        System.out.println(pessoa3.getTelefone());
        
        //5) Crie uma variavel pessoa4:Pessoa e
        introducao.exercicio4.Pessoa pessoa4;
        // atribua o valor da pessoa2.Imprima
        pessoa4 = pessoa2;
        //em tela os atributos que são visíveis.
        System.out.println(pessoa4.getNome());
        System.out.println(pessoa4.getTelefone());

        //6) Crie uma variavel funcionario2:Funcionario
        Funcionario funcionario2;
        //e atribua o valor de pessoa3.Imprima
        funcionario2 =  (Funcionario)pessoa3;
        // em tela os atributos que são visiveis. 
        System.out.println(funcionario2.getNome());
        System.out.println(funcionario2.getCPF());
        System.out.println(funcionario2.getDataNascimento());
        System.out.println(funcionario2.getFuncao());
        System.out.println(funcionario2.getId());
        System.out.println(funcionario2.getTelefone());


        //7) Crie uma variavel empresa2:EmpresaCliente e
        EmpresaCliente empresa2;
        // atribua o valor de pessoa4.
        // Imprima em tela os atributos que são visiveis.
        empresa2 = (EmpresaCliente)pessoa4;
        System.out.println(empresa2.getNome());
        System.out.println(empresa2.getCNPJ());
        System.out.println(empresa2.getDataCriacao());
        System.out.println(empresa2.getMarca());
        System.out.println(empresa2.getNumFuncionarios());
        System.out.println(empresa2.getTelefone());
        
        
    }
    
}
