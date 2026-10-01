package AtividadeLista1If;
import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number = sc.nextInt();
        System.out.println("O numero antecessor ao digitado é: " +(number-1));
    }
}
