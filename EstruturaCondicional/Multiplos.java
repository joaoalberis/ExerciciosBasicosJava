package EstruturaCondicional;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = entrada.nextInt();
        if (num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("Sao multiplos");
        }else{
            System.out.println("nao sao multiplos");
        }
    }
}
