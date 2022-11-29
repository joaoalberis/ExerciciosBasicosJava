package EstruturaSequencial;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        int a,b,c,d, diferenca;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        a = entrada.nextInt();
        System.out.print("Digite o segundo numero: ");
        b = entrada.nextInt();
        System.out.print("Digite o terceiro numero: ");
        c = entrada.nextInt();
        System.out.print("Digite o quarto numero: ");
        d = entrada.nextInt();

        diferenca = a * b - c * d;
        System.out.println("DIFERENCA = " + diferenca);
    }
}
