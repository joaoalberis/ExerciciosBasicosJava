package EstruturaCondicional;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero e veja se é par: ");
        int num = entrada.nextInt();
        if(num % 2 == 0) {
            System.out.println("par");
        }else{
            System.out.println("impar");
        }
    }
}
