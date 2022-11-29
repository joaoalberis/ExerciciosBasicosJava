package EstruturaSequencial;

import java.util.Scanner;

public class Soma{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, resul;

        System.out.print("Digite o primeiro numero: ");
        a = entrada.nextInt();
        System.out.print("Digite o segundo numero: ");
        b = entrada.nextInt();
        resul = a + b;

        System.out.println("SOMA = " + resul);
    }
}

