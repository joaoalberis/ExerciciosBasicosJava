package EstruturaCondicional;

import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do eixo X: ");
        Double x = entrada.nextDouble();
        System.out.print("DIgite o valor do eixo Y: ");
        Double y = entrada.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("Origem");
        }else if(x == 0 && y != 0){
            System.out.println("Está no eixo y");
        }else if(x != 0 && y == 0){
            System.out.println("Está no eixo x");
        }else if(x > 0 && y > 0){
            System.out.println("Está no primeiro quadrante");
        }else if (x < 0 && y> 0){
            System.out.println("Está no segundo quadrante");
        }else if (x<0 && y<0){
            System.out.println("Está no terceiro quadrante");
        }else if(x>0 && y<0){
            System.out.println("Está no quarto quadrante");
        }

    }
}
