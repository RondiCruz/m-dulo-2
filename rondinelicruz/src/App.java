import sistema.Celular;
import sistema.Pessoa;
import sistema.view.Aplicativo;


public class App {
    public static void main(String[] args) throws Exception {



        //passagem de parametros
        Pessoa zezinho = new Pessoa("Laranja");
        zezinho.setNome  (" Zezinho da Silva Sauro ");
        zezinho.setCPF  ("555.555.555.55");
        zezinho.setAltura  (1.8f);
        zezinho.setIdade  (22);
        zezinho.setRaca(" A ");
        System.out.println(zezinho.getNome() + " Raca: " + zezinho.getRaca());
        zezinho.mostraRaca();
        Pessoa.mostraRaca();

        Pessoa luizinho = new Pessoa("Limão");
        luizinho.setRaca(" B ");
        System.out.println(luizinho.getNome() + " Raca: " + luizinho.getRaca());
        System.out.println(zezinho.getNome() + " Raca: " + zezinho.getRaca());

        //luizinho.nome = "Luizinho da Silva Sauro Jr";

        System.out.println(zezinho.getNome());
        System.out.println(zezinho.getCPF());
        System.out.println(zezinho.getAltura());
        System.out.println(zezinho.getIdade());
        System.out.println(luizinho.getNome());
        System.out.println(luizinho.getCPF());
        System.out.println(luizinho.getIdade());

        String guardaResultado = zezinho.podeDirigir();
        System.out.println(guardaResultado);

        guardaResultado = luizinho.podeDirigir();
        System.out.println(guardaResultado);

        zezinho.mostraCPF();
        luizinho.mostraCPF();

        Celular startak = new Celular("(47) 99999-55555");
        startak.setModelo("PT 550");
        startak.setMarca("Motorola");

        startak.setDono(zezinho);

        Aplicativo app1 = new Aplicativo("Angry Birds");
        Aplicativo app2 = new Aplicativo("Whatsapp");
        Aplicativo app3 = new Aplicativo("Tiktoc");
        Aplicativo app4 = new Aplicativo("Instagram");

        startak.getListaAplicativos().add(app1);
        startak.getListaAplicativos().add(app2);
        startak.getListaAplicativos().add(app3);
        startak.getListaAplicativos().add(app4);
        /*startak.getListaAplicativos().add("Banana");
        startak.getListaAplicativos().add(1234);
        startak.getListaAplicativos().add(1200.05f);
        startak.getListaAplicativos().add(true);*/

        startak.getListaAplicativos().remove(2);
        startak.getListaAplicativos().set(2,new Aplicativo("Grobopray"));
        System.out.println(startak.getListaAplicativos().indexOf(app1));

        for(int i=0; i < startak.getListaAplicativos().size() ; i++){
          System.out.println(startak.getListaAplicativos().get(i).getNome());
        }
        //for each = PARA CADA
        for(Aplicativo umApp : startak.getListaAplicativos()){
          System.out.println(umApp);
        }

       

      }
    }       
        






      

       
