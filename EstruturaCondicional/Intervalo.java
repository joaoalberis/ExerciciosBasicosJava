package EstruturaCondicional;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o numero do intervalo: ");
        Double inter = entrada.nextDouble();
        if (inter >= 0 && inter <= 25.00){
            System.out.println("Intervalo [0, 25]");
        }else if(inter >25.00 && inter <= 50.00){
            System.out.println("Intervalo [25, 50]");
        }else if(inter >50.00 && inter <=75.00){
            System.out.println("Intervalo [50, 75]");
        }else if(inter > 75.00 && inter <=100.00){
            System.out.println("Intervalo [75, 100]");
        }else{
            System.out.println("FOra do intervalo");
        }
    }
}
