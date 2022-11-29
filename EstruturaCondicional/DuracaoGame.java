package EstruturaCondicional;

import java.util.Scanner;

public class DuracaoGame {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

		int horaInicial = entrada.nextInt();
		int horaFinal = entrada.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
