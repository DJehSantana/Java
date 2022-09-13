package Main;

public class Aula_JavaRepeticoes {
    public static void main(String[] args) {
        //trabalhando com estruturas de repetições
        //FOR
        System.out.println("Brincando de tabuada com FOR");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " x " + i + " = " + j * i);
            }            
        }
        
    }
}
