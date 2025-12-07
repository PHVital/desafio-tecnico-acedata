import java.util.Scanner;

public class CalculoSalarial {
    public static void run(Scanner sc) {
        System.out.println("\n=== CÁLCULO DE SALÁRIO ===");
        System.out.println("Valor do salário por hora: ");
        double salarioPorHora = sc.nextDouble();
        System.out.println("Quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = sc.nextDouble();
        System.out.println("Número de filhos menores de 14 anos: ");
        int qtdFilhos = sc.nextInt();

        double salarioBruto = calcularSalarioBruto(salarioPorHora, horasTrabalhadas);
        double salarioFamilia = calcularSalarioFamilia(salarioBruto, qtdFilhos);
        double salarioLiquido = calcularSalarioLiquido(salarioBruto, salarioFamilia);

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Salário Familia: R$ %.2f%n", salarioFamilia);
        System.out.printf("Salário Liquido: R$ %.2f%n", salarioLiquido);
    }


    public static double calcularSalarioBruto(double salarioPorHora, double horasTrabalhadas) {
        return salarioPorHora * horasTrabalhadas;
    }

    private static double calcularSalarioFamilia(double salarioBruto, int qtdFilhos) {
        if(salarioBruto <= 788.0) {
            return 30.5 * qtdFilhos;
        } else if(salarioBruto > 788.0 && salarioBruto <= 1100.0) {
            return 18.5 * qtdFilhos;
        } else {
            return 11.9 * qtdFilhos;
        }
    }

    private static double calcularSalarioLiquido(double salarioBruto, double salarioFamilia) {
        return salarioBruto + salarioFamilia;
    }
}
