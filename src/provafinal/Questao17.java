package provafinal;

import java.util.Scanner;

public class Questao17 {

    /*17 - Foi feita uma pesquisa entre os habitantes de uma região 
    e coletados os dados de altura e sexo (0=masc, 1=fem) das pessoas. 
    Faça um programa que leia 50 dados diferentes e informe:
∙ a maior e a menor altura encontradas; 
∙ a média de altura das mulheres;
∙ a média de altura da população;
∙ o percentual de homens na população.

     */

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int sexo = 0;
        double altura, maiorAltura = 0.1, menorAltura = 999999999,
                mediaAltFem = 0, altFem = 0, mediaAlt = 0, alturaGeral = 0, perc = 0, masc = 0, fem = 0, i;

        for (i = 0; i < 5; i++) {

            System.out.println("Digite seu sexo: " + "\n0=masc, 1=fem ");
            sexo = ler.nextInt();

            System.out.println("Altura:");
            altura = ler.nextDouble();

            //Maior e menor altura
            if (altura > maiorAltura) { //maior altura
                maiorAltura = altura;
            }
            if (altura < menorAltura) { //menor altura
                menorAltura = altura;
            }

            if (sexo == 0) { //masculino
                masc++; //contador sexo masculino
            }
            if (sexo == 1) { // feminino
                fem++; //contador sexo feminino
                altFem += altura; //acumulador de altura feminina alturaFemina = alturaFemina + altura 
                mediaAltFem = altFem / fem; //media altura feminina 
            }
            alturaGeral += altura; //acumulando soma das alturas gerais
            mediaAlt = alturaGeral / (fem + masc); //media altura da populaçaõ em geral    
        }
        perc = (masc / (fem + masc)) * 100; //percentual masculino

        System.out.println("Pesquisa:"
                + "\nMaior altura: " + maiorAltura
                + "\nMenor Altura: " + menorAltura
                + "\nMedia altura das mulheres: " + mediaAltFem
                + "\nMedia altura da população: " + mediaAlt
                + "\nPercentual de homens da população: " + perc + " %");
    }
}
