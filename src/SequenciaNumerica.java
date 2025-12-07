import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class SequenciaNumerica {
    public static void run(Scanner sc) {
        System.out.println("\n=== SEQUÊNCIA NUMÉRICA ===");
        System.out.println("Quantidade de números: ");
        int quantidade = sc.nextInt();

        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite um número: ");
            numeros.add(sc.nextInt());
        }

        System.out.println("Sequência Digitada: " + numeros);
        encontrarMenorMaior(numeros);
    }

    private static void encontrarMenorMaior(List<Integer> numeros) {
        if (numeros.isEmpty()) {
            System.out.println("A lista está vazia!");
            return;
        }

        int menor = numeros.stream().min(Integer::compareTo).get();
        int maior = numeros.stream().max(Integer::compareTo).get();
        System.out.println("O valor do menor é: " + menor);
        System.out.println("O valor do maior é: " + maior);
    }
}
