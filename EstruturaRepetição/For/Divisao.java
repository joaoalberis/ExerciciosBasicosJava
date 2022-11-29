package EstruturaRepetição.For;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n = entrada.nextInt();
        double valor1, valor2, result;
        for(int x = 0; x<n; x++){
            System.out.print("Digite o valor do numero 1: ");
            valor1 = entrada.nextInt();
            System.out.print("DIgite o valor do numero 2: ");
            valor2 = entrada.nextInt();
            if (valor2 == 0){
                System.out.println("Divisão impossivel");
            }else if(valor1 == 0){
                System.out.println("0.0");
            }else{
                result = valor1 /valor2;
                System.out.println(result);
            }
        }
    }
}
