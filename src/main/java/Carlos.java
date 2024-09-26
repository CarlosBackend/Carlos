public class Carlos {
    String nome;
    String estudo;
    Integer idade;
    boolean work;

    public Carlos(String nome, String estudo, Integer idade, boolean work){
        this.nome = nome;
        this.estudo = estudo;
        this.idade = idade;
        this.work = work;
    }
    public void seApresentar() {
        System.out.println("Olá meu nome é " + nome + " .Eu estudo " + estudo + " e tenho " + idade + " de idade ");
    }

    public String estaTrabalhando(){
        return work? "Sim, estou trabalhando":"Não, atualmente não trabalho";
    }
    public void aniversario(){
        idade++;
        System.out.println("Feliz aniversário! Agora você tem " + idade +" anos");
    }
    public static void main(String[] args) {
        Carlos carlos = new Carlos("Carlos Henrique ", "Engenharia de software",25,true);
        carlos.seApresentar();
        System.out.println("Estou trabalhando? " + carlos.estaTrabalhando());
        carlos.aniversario();
        carlos.aniversario();
    }
}