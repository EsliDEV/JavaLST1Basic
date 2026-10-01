package AtividadeLista1If;
import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int notaOne = sc.nextInt();
        System.out.println("Digite a segunda nota: ");
        int notaTwo = sc.nextInt();
        int pesoOne = 2;
        int pesoTwo = 3;
        System.out.println("A Media ponderada da primeira nota é : " + (notaOne*pesoOne) +
                " e a segunda nota tem a media ponderada de " + (notaTwo*pesoTwo));
    }
}
