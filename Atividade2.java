package AtividadeLista1If;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        int not1,not2,not3,not4,media;
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o 1 numero");
        not1 = sc.nextInt();
        System.out.println("insira o 2 numero");
        not2 = sc.nextInt();
        System.out.println("insira o 3 numero");
        not3 = sc.nextInt();
        System.out.println("insira o 4 numero");
        not4 = sc.nextInt();
        media =(not1+not2+not3+not4)/4;
        System.out.println("a media dos digitos digitados é:" + media);

    }
}
