package provafinal;

import java.util.Scanner;

/*
 * @author Priscila Butzke

7 - faça um algoritmo que receba o nome do vendedor e o salário-bruto. 
Calcule e mostre o salário liquido, 
sabendo-se que esse funcionário tem um acréscimo de bônus de 5,5% sobre o salário-bruto
e paga imposto de renda
- (Se ele receber um salário liquido abaixo de R$ 3.500 
descontar 3,5% sobre o total caso contrário descontar 7,5% sobre o total .
Mostre a folha de pagamento igual como aparece abaixo:

Nome: <nome>
Salario Bruto: R$ <??>
Bônus: R$ <??>
I.R: R$ <??>
Salario Liquido: R$<??>
 */
public class Questao7 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome;
        double sal_bruto, sal_liq, bonus,ir;

        //Entrada de dados
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();

        System.out.println("Salário-bruto: ");
        sal_bruto = ler.nextDouble();

        //calculo de bônus
        bonus = sal_bruto * 0.055;
        
        if(sal_bruto < 3500){
            ir = (sal_bruto + bonus) * 0.035;
            
        }else{
            ir = (sal_bruto + bonus) * 0.075;
        }
        sal_liq = sal_bruto - ir + bonus;

        System.out.println("Nome: " + nome
                + "\nSalario Bruto: R$ " + sal_bruto
                + "\nBônus: R$ " + bonus
                + "\nI.R: R$ " + ir
                + "\nSalario Liquido: R$ " + sal_liq);
    }
}
