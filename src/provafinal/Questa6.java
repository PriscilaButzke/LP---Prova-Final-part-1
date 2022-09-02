package provafinal;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * @author Priscila Butzke
*
 * 6 - Faça um algoritmo que receba o valor do raio de um circulo qualquer. 
 * Calcule o perímetro do círculo (P = 2.pi.r) , a Área do circulo (A = PI . r²) 
 * e o Diâmetro do círculo (D = 2 . r). 
 * Mostre as respostas. obs.: Para testar utilize o NetBeans, 
 * em seguida na resposta coloque o link do GitHub com sua resposta.
 */
public class Questa6 {

    public static void main(String[] args) {

        /* r = raio, p = perímetro, a = area, d = diâmetro */
        double r,p,a,d;
        DecimalFormat df = new DecimalFormat("0.00");//formato os campos 
        Scanner ler = new Scanner(System.in);
        
        System.out.println(" --- Circulo --- "
                + "\nDigite o valor do raio:");
        r = ler.nextDouble(); //entrada do valor de raio
        
        //Formulas 
        p = 2*Math.PI * r;
        a = Math.PI * (r * r);
        d= 2 * r;
        
        System.out.println("Raio: " + r
                            + "\nPerímetro: " + df.format(p)
                            + "\nÁrea: " + df.format(a)
                            + "\nDiâmetro: " + df.format(d));
    }
}
