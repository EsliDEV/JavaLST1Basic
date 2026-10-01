package AtividadeLista1If;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("insira seu nome:");
        nome = sc.nextLine();
        System.out.println("digite um numero:");
        int numberOne;
        numberOne = sc.nextInt();
        System.out.println("digite um segundo numero:");
        int numberTwo;
        numberTwo = sc.nextInt();
        int resultado = numberOne/numberTwo;
        System.out.println(nome + "seu resultado é: "+ resultado);

        System.out.println(resultado);
    }
}
