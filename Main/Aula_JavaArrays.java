package Main;

import java.util.Arrays;

public class Aula_JavaArrays {

    public static void main(String[] args) {
        //trabalhando com arrays
        //no Java não podemos misturar tipos de dados dentro do array

        int[] numeros = {9, 10, 20, 22, 5};

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        String[] letras = {"a", "b", "c", "d", "E"};

        //classe Arrays do Java gerencia o array
        System.out.println(Arrays.toString(letras));
    
        int maior = numeros[0];
        int menor = numeros[0];
        float media = 0;

        //comparações manuais entre elementos dos arrays
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            // operador += significa somar e atribuir 
            media += numeros[i];
        }

        media = (float) media/numeros.length;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);



        
    }
}
