package EstruturaSequencial;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        double pi = 3.14149;
        double raio;
        double area;
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        raio = entrada.nextDouble();
        area = pi * Math.pow(raio, 2);
        System.out.format("A=%.4f", area);
    }
}
