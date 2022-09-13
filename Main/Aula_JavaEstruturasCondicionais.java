package Main;

public class Aula_JavaEstruturasCondicionais{
    public void Main() {

    }

    public static void main(String[] args) {

        //Trabalhando com estruturas condicionais

        int nota = 50;
        String graduacao;
        String menssagem;

        //A = 80; B = 70; C=60; D= 50 E < 50

        if (nota >= 80) {
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >= 50) {
            graduacao = "D";
        } else if (nota < 50 && nota >= 0) {
            graduacao = "E";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
            case "C":
                menssagem = "Aluno aprovado com a nota: ";
                break;
            case "D":
            case "E": 
                menssagem = "Aluno reprovado com a nota: ";               
                break;
        
            default:
                menssagem = "Nota inválida!";
                break;
        }

        System.out.println(menssagem + graduacao);
        
    }

}