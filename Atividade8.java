package AtividadeLista1If;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int restOne = sc.nextInt();
        int restTwo = sc.nextInt();
        int resto = restOne%restTwo;
        System.out.println("O resto da divisão do numero" + restOne + " é " + restTwo + " é " + (resto));



    }

}
