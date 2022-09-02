package provafinal;

/*
 * @author Priscila Butzke
13 - Dado um país A, com 5.000.000 de habitantes 
e uma taxa de natalidade de 3% ao ano, e um país B com 7.000.000 de habitantes 
e uma taxa de natalidade de 2% ao ano, escreva um programa, 
que imprima o tempo necessário para que a população do país A ultrapasse a população do país B.
Utilize laços de repetições para resolver o problema.
 */
public class Questao13 {

    public static void main(String[] args) {
        double a = 5000, b = 7000, ano = 0;
        while (a != b) {
            a += (0.03 * a);
            b += (0.02 * b);
            ano++;
        }
        System.out.println(ano);
    }
}
