package AtividadeLista1If;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne, numberTwo, resul;
        System.out.println("Digite o primeiro digito: ");
        numberOne = sc.nextInt();
        System.out.println("Digite o segundo digito: ");
        numberTwo = sc.nextInt();
        resul = numberOne + numberTwo;
        System.out.println("A soma do numero " + numberOne + " + " + numberTwo + " é " + resul);
    }
}
