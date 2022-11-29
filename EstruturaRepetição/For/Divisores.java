package EstruturaRepetição.For;

import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero e veja seus divisores: ");
        int valor = entrada.nextInt(), result;
        for (int x = 1; x <= valor; x++){
            if (valor % x == 0){
                System.out.println(x);
            }
        }

    }
}
