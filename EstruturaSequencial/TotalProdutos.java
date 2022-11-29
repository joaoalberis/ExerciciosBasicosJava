package EstruturaSequencial;

import java.util.Scanner;

public class TotalProdutos {
   public static void main(String[] args) {
        int numpeca1, numpeca2, quantiapeca1, quantiapeca2;
        Double valorpeca1, valorpeca2, resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o codigo da peça 1: ");
        numpeca1 = entrada.nextInt();
        System.out.print("Digite a quantidade da peça 1: ");
        quantiapeca1 = entrada.nextInt();
        System.out.print("Digite o valor unitario da peça 1: ");
        valorpeca1 = entrada.nextDouble();
        System.out.print("Digite o codigo da peça 2: ");
        numpeca2 = entrada.nextInt();
        System.out.print("DIgite a quantidade da peça 2: ");
        quantiapeca2 = entrada.nextInt();
        System.out.print("Digite o valor unitario da peça 2: ");
        valorpeca2 = entrada.nextDouble();
        resultado = (quantiapeca1 * valorpeca1) + (quantiapeca2 * valorpeca2);
        System.out.println("Valor a pagar: " + resultado);
   } 
}
