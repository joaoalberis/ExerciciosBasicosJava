package EstruturaRepetição.While;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        int senhaacesso = 2002;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a senha de acesso: ");
        while(senhaacesso != entrada.nextInt()){
            System.out.println("Senha incorreta");
            System.out.print("Digite a senha de acesso: ");
        }
        System.out.println("Acesso permitido");
    }
}
