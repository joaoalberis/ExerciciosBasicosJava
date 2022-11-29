package EstruturaCondicional;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero e veja se é posito ou negativo: ");
        int num = entrada.nextInt();
        if (num < 0){
            System.out.println("negativo");
        }else{
            System.out.println("positivo");
        }
    }
}
