package EstruturaRepetição.While;

import java.util.Scanner;

public class TipoCombustivel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
        int tipo = entrada.nextInt();
        int gasolina=0, alcool=0, diesel=0;
        while (tipo != 4){
            if(tipo == 1){
                alcool++;
                tipo = entrada.nextInt();
            }else if(tipo == 2){
                gasolina++;
                tipo = entrada.nextInt();
            }else if(tipo == 3){
                diesel++;
                tipo = entrada.nextInt();
            }else{
                System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
                tipo = entrada.nextInt();
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
