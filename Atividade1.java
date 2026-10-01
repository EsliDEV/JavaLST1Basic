package AtividadeLista1If;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5,soma,fim;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        num1 = sc.nextInt();
        System.out.println("digite o segundo numero");
        num2 = sc.nextInt();
        System.out.println("digite o terceiro numero");
        num3 = sc.nextInt();
        System.out.println("digite o quarto numero");
        num4 = sc.nextInt();
        System.out.println("digite o ultimo numero");
        num5 = sc.nextInt();
        soma=num1+num2+num3+num4;
        fim =soma/num5;

        System.out.println("a soma dos 4 primeiros digitos dividido pelo 5 é: " + fim );

    }
}