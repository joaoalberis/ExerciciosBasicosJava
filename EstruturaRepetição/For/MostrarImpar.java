package EstruturaRepetição.For;

import java.util.Scanner;

public class MostrarImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = entrada.nextInt();
        for(int x = 1; x<=valor; x++){
            if (x % 2 != 0){
                System.out.println(x);
            }
        }
    }
}
