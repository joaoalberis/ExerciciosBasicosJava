package EstruturaRepetição.While;

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do eixo x: ");
        Double x = entrada.nextDouble();
        System.out.print("Digite o valor do eixo y: ");
        Double y = entrada.nextDouble();

        while(x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("Está no primeiro quadrante");
            }else if (x < 0 && y> 0){
                System.out.println("Está no segundo quadrante");
            }else if (x<0 && y<0){
                System.out.println("Está no terceiro quadrante");
            }else if(x>0 && y<0){
                System.out.println("Está no quarto quadrante");
            }
            System.out.print("Digite o valor do eixo x: ");
            x = entrada.nextDouble();
            System.out.print("Digite o valor do eixo y: ");
            y = entrada.nextDouble();
        }
    }
}
