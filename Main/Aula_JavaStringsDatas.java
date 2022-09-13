package Main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Aula_JavaStringsDatas {

    public static void main(String[] args) {
        //manipulação de strings e datas
        //Olá, {nome}. Hoje é {dia-da-semana}. BOM DIA!

        String nome = "Jéssica";

        //deixando o nome em letras maiúsculas
        System.out.println("Seu nome em letras maiúsculas: " + nome.toUpperCase());
        //deixando o nome em letras minúsculas
        System.out.println("Seu nome em letras minúsculas: " + nome.toLowerCase());
        //consultando o numero de caracteres de uma String
        System.out.println("Quantidade de caracteres do seu nome: " + nome.length());

        //comparando strings

        String outroNome = "jéssica";

        //o "ignorecase" faz o java ignorar diferença de upper e lowercase
        System.out.println(nome.equalsIgnoreCase(outroNome));

        //ISO 8601 - padrão de data

        //mostrando a data de hoje
        LocalDate hoje = LocalDate.now();
        System.out.println("Data: " + hoje);

        //Selecionando localização da data através do locale
        Locale brasil = new Locale ("pt", "BR");        

        //mostrando o dia da semana 
        String diaSemana =  hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        System.out.println("Dia da semana: " + diaSemana);

        //Selecionando horário do momento
        LocalDateTime agora = LocalDateTime.now();

        //verificando se é manhã tarde ou noite
        String saudacao = "Olá";
        int hora = agora.getHour();

        if (hora >= 0 && hora < 12) {
            saudacao = "Bom Dia!";
        } else if (hora >= 12 && hora < 18) {
            saudacao = "Boa Tarde!";
        } else if (hora >= 18 && hora < 24) {
            saudacao = "Boa Noite!";
        } 

        // no printf %s = string por ordem, e %n = quebra de linha
        System.out.printf("Olá, %s. Hoje é %s, %s%n", nome, diaSemana, saudacao);




        

    }
}
