package Main;

public class Aula_JavaCondicionais {
    public void Main() {

    }
    public static void main (String[] args) {
        //trabalhando com booleanos e operadores condicionais
        boolean fimDeSemana = true;
        boolean fazendoSol = false;
        //verifica se é fim de semana ou está fazendo sol
        //se uma das condições for verdade a variável vamosAPraia recebe valor true
        boolean vamosAPraia = fimDeSemana || fazendoSol;

        System.out.println("Trabalhando com condicionais!");
        System.out.println("Vamos a praia? " + vamosAPraia);

        //Trabalhando com operador ternário
        //Se valor true a variavel receberá a primeira mensagem, do contrário receberá a segunda mensagem
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        String mensagem2 = fazendoSol ? "Está fazendo sol" : "Não está fazendo sol";
        //Exibindo mensagens
        System.out.println(mensagem);
        System.out.println(mensagem2);


    }
}