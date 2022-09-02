package provafinal;

import java.util.Scanner;

/*
 * @author Priscila Butzke 12
 * - Uma fábrica de camisetas produz os tamanhos
 * pequeno, médio e grande, cada uma sendo vendida respectivamente por 10, 12 e 15 reais. 
 * Construa um algoritmo em que o usuário forneça a quantidade de
 * camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
 * informe quanto será o valor arrecadado.
 * Vale ressaltar que se a quantidade de cada camiseta for superior a 5 haverá um desconto de 5,5% 
 * - Mostre o valor total de cada camiseta e se as quantidades forem suficiente para o desconto
 * mostre o valor final com desconto.
 */
public class Questao12 {

    public static void main(String[] args) {

        double quantP, quantM, quantG, p = 0, m = 0, g = 0,
                desc, valorBruto, valorLiquido;
        String venda;
        Scanner ler = new Scanner(System.in);

        //entrada de dados
        System.out.println("Código da venda: ");
        venda = ler.nextLine();

        System.out.println("Informe a quantidade de camisetas:"
                + "\n Tamanho P: ");
        quantP = ler.nextDouble();

        System.out.println("Tamanho M: ");
        quantM = ler.nextDouble();

        System.out.println("Tamanho G: ");
        quantG = ler.nextDouble();

        //compras acima de 5 camisas por categoria, desconto
        if (quantP > 5 && quantM > 5 && quantG > 5) {
            p = 9.45;
            m = 11.34;
            g = 14.175;
            valorBruto = (quantP * p) + (quantM * m) + (quantG * g);
            valorLiquido = valorBruto;

            System.out.println("Código da venda: " + venda
                    + "\nCamisetas:"
                    + "\nP: R$ " + p
                    + "\nM: R$ " + m
                    + "\nG: R$ " + g
                    + "\nTotal com descosto: " + valorLiquido);
            // compras sem desocnto
        } else {
            p = 10;
            m = 12;
            g = 15;
            valorBruto = (quantP * p) + (quantM * m) + (quantG * g);
            valorLiquido = valorBruto;

            System.out.println("Código da venda: " + venda
                    + "\nCamisetas:"
                    + "\nP: R$ " + p
                    + "\nM: R$" + m
                    + "\nG: R$ " + g
                    + "\n Total: " + valorLiquido);
        }
    }
}
