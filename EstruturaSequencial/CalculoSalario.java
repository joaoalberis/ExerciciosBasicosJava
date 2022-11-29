package EstruturaSequencial;

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        int numfuncionario, horastrabalhadas;
        double salariohora, resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o numero do funcionario: ");
        numfuncionario = entrada.nextInt();
        System.out.print("Digite as horas trabalhadas: ");
        horastrabalhadas = entrada.nextInt();
        System.out.print("Digite o salario por hora: ");
        salariohora = entrada.nextDouble();
        resultado = horastrabalhadas * salariohora;
        System.out.println("Number: " + numfuncionario);
        System.out.println("Salary: " + resultado);
    }
}
