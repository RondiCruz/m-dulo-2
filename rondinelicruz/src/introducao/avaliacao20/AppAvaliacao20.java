package introducao.avaliacao20;



public class AppAvaliacao20 {
    public static void main(String[] args) {

        

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Zezinho");
        pessoa1.setDataNascimento("01/12/1980");
        
        

        Curriculo curr1 = new Curriculo();
        curr1.setPessoa(pessoa1);
         

        Formacao form1 = new Formacao();
        form1.setNome("Ensino Médio");
        form1.setAnoConclusao("1999");
        curr1.getListaFormacoes().add(form1);

        Formacao form2 = new Formacao();
        form2.setNome("Curso Novos Talentos em TI");
        form2.setAnoConclusao("2022");
        curr1.getListaFormacoes().add(form2);

        ExperienciaProfissional exp1 = new ExperienciaProfissional();
        exp1.setNome("Monstro em Java");
        exp1.setAnoConclusao("2022");
        curr1.getListaExperienciasProfissionais().add(exp1);


    
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Mariazinha");
        pessoa2.setDataNascimento("10/07/1981");
        

        Curriculo curr2 = new Curriculo();
        curr2.setPessoa(pessoa2);

        Formacao form3 = new Formacao();
        form3.setNome("Ensino Médio");
        form3.setAnoConclusao("2000");
        curr2.getListaFormacoes().add(form3);

        Formacao form4 = new Formacao();
        form4.setNome("Curso Novos Talentos em TI");
        form4.setAnoConclusao("2022");
        curr2.getListaFormacoes().add(form4);

        ExperienciaProfissional exp2 = new ExperienciaProfissional();
        exp2.setNome("DBA em MariaDB");
        exp2.setAnoConclusao("Atual");
        curr2.getListaExperienciasProfissionais().add(exp2);

        ExperienciaProfissional exp3 = new ExperienciaProfissional();
        exp3.setNome("Desenvolvedora FullStack");
        exp3.setAnoConclusao("2021");
        curr2.getListaExperienciasProfissionais().add(exp3);


        String Curriculo1 = curr1.gerarCurriculo();
        System.out.println(Curriculo1);
        
        


        
        

    }
    
}
