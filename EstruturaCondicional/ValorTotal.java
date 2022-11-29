package EstruturaCondicional;

import java.util.Scanner;

public class ValorTotal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("DIgite o codigo do produto: ");
        int codigo = entrada.nextInt();
        System.out.print("DIgite a quantidade de produtos: ");
        int quantia = entrada.nextInt();
        Double resul;

        switch (codigo) {
            case 1:
                resul = quantia * 4.00;
                System.out.println("TOtal: " + resul);
                break;
            case 2:
                resul = quantia * 4.50;
                System.out.println("TOtal: " + resul);
                break;
            case 3:
                resul = quantia * 5.00;
                System.out.println("TOtal: " + resul);
                break;
            case 4:
                resul = quantia * 2.00;
                System.out.println("TOtal: " + resul);
                break;
            case 5:
                resul = quantia * 1.50;
                System.out.println("TOtal: " + resul);
                break;
            default:
                System.out.println("DIgite um codigo valido, os codigos validos sao 1 até 5");
                break;
        }
    }
}
