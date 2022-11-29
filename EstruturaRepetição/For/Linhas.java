package EstruturaRepetição.For;

import java.util.Scanner;

public class Linhas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int valor = entrada.nextInt(), result;

        for(int x = 1; x<=valor; x++){
            System.out.print(x + " ");
            System.out.print((int) Math.pow(x, 2) + " ");
            System.out.print((int) Math.pow(x, 3) + "\n");
        }
    }
}
