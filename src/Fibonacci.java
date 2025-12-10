import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void run(Scanner sc) {
        System.out.println("\n=== FIBONACCI ===");
        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        List<Integer> sequencia = gerarNPrimeiros(n);
        System.out.println("Os " + n + " primeiros números são: " + sequencia);

        boolean pertence = verificarPertencimento(n);

        if (pertence) {
            System.out.println("O número " + n + " faz parte da sequência de Fibonacci");
        } else {
            System.out.println("O número " + n + " não faz parte da sequência de fibonacci");
        }
    }

    private static List<Integer> gerarNPrimeiros(int quantidade) {
        List<Integer> lista = new ArrayList<>();
        if (quantidade <= 0) return lista;

        int a = 1, b = 0, c = 0;

        for (int i = 0; i < quantidade; i++) {
            lista.add(a);
            int aux = a;
            int aux2 = b;
            if (a % 2 != 0) {
                a = a + b;
                b = aux;
                c = aux2;
            } else {
                a = a + b + c;
                b = aux;
                c = aux2;
            }
        }
        return lista;
    }

    private static boolean verificarPertencimento(int n) {
        if (n < 1) return false;

        int a = 1, b = 0;

        while (a < n) {
            int aux = a;
            a = a + b;
            b = aux;
        }
        return a == n;
    }
}
