package EstruturaRepetição.For;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de testes a ser feitos: ");
        int valor = entrada.nextInt();
        Double num1, num2, num3, result;
        for(int x=0; x<valor; x++){
            System.out.println("Digite o numero 1: ");
            num1 = entrada.nextDouble();
            System.out.println("Digite o numero 2: ");
            num2 = entrada.nextDouble();
            System.out.println("Digite o numero 3: ");
            num3 = entrada.nextDouble();
            result = (num1 * 2 + num2 * 3 + num3 * 5) / 10;
            System.out.format("%.1f\n", result);
        }
    }
}
