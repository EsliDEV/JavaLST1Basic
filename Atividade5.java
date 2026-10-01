package AtividadeLista1If;
import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne, numberTwo, result;
        System.out.println("Digite o 1° numero: ");
        numberOne = sc.nextInt();
        System.out.println("Digite o 2° numero: ");
        numberTwo = sc.nextInt();
        result = numberOne - numberTwo;
        System.out.println("O numero " + numberOne + " - " + numberTwo + " tem o resultado de: " + result);
    }
}
