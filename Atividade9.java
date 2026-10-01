package AtividadeLista1If;
import java.util.Scanner;
public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number = sc.nextInt();
        System.out.println("O dobro do " +number+ " é " + (number*2) + " e o triplo é " + (number*3));
    }
}
