import java.util.Scanner;

public class SistemaAvaliacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n=== SISTEMA DE AVALIACAO ===");
            System.out.println("1 - Cálculo Salarial");
            System.out.println("2 - Análise de Sequência Numérica");
            System.out.println("3 - Fibonacci");
            System.out.println("Escolha uma opção: ");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    CalculoSalarial.run(sc);
                    break;
                case 2:
                    SequenciaNumerica.run(sc);
                    break;
                case 3:
                    Fibonacci.run(sc);
                    break;
                case 0:
                    executando = false;
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
        sc.close();
    }
}
