package EstruturaRepetição.For;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor para ser fatorado: ");
        int fator = entrada.nextInt(), result = 1;
        for(int x = 1; x<=fator; x++){
            result = result * x;
        }
        System.out.println(result);
    }
}
