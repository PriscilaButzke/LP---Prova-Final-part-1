package provafinal;

import java.util.Scanner;

/*
 * @author Priscila Butzke
18 – Crie um algoritmo que preencha um vetor de 10 posições, 
ao término mostre a maior nota e a sua posição no vetor.
 */
public class Questao18 {

    public static void main(String[] args) {
        double[] nota = new double[5];
        double maior = 0.001;
        int i,c = 0;

        Scanner ler = new Scanner(System.in);

        for (i = 0; i < nota.length; i++) {
            System.out.println("Digite a nota: ");
            nota[i] = ler.nextDouble();

            while (nota[i] > maior) {
                maior = nota[i];
                c++;
            }
        }
        System.out.println("A maior nota é " + maior
                + "\nPosiçao do vetor: " +  (c - 1));
    }
}
