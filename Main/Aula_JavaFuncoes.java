package Main;

public class Aula_JavaFuncoes {
    public static void main(String[] args) {
       //trabalhando com funções
       //as funções servem para armazenar trechos de códigos que serão usados em diferentes momentos da nossa aplicação
       // as funções a serem executadas devem ser chamadas dentro do método main
       String nomeOriginal = "Let's Code";
       
       //para usar variáveis ao chamar um método, essas devem ser passadas por parâmetro
       saudacao(nomeOriginal);
       
       
    }

    public static void saudacao(String nomeParametro) {
        System.out.println("Hello World! Bem vindo: " + nomeParametro);
    }
}
