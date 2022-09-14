package Main;

public class Aula_JavaFuncoes {
    public static void main(String[] args) {
       //trabalhando com funções
       //as funções servem para armazenar trechos de códigos que serão usados em diferentes momentos da nossa aplicação
       // as funções a serem executadas devem ser chamadas dentro do método main
       String nomeOriginal = "Let's Code";
       
       //para usar variáveis ao chamar um método, essas devem ser passadas por parâmetro
       saudacao(nomeOriginal);
    
       // a variavel resultado está recebendo o retorno da função soma
       int resultado = soma (2, 3);
       System.out.println("Realizando soma com funções");
       System.out.println("Resultado: " + resultado);

       
       
    }

    public static void saudacao(String nomeParametro) {
        System.out.println("Hello World! Bem vindo: " + nomeParametro);
    }

    public static int soma (int a, int b) {
        //retorna o resultado da operação
        return a + b;
    }
}
