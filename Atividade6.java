package AtividadeLista1If;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne;
        System.out.println("Digite um numero:");
        numberOne = sc.nextInt();
        System.out.println("A raiz quadrada do numero " + numberOne + " é " + Math.sqrt(numberOne));
    }
}
