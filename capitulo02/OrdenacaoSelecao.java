package capitulo02;

// Capítulo 2 - Ordenação por Seleção
// Este capítulo apresenta o algoritmo de ordenação por seleção, que funciona encontrando o menor elemento e movendo-o para a posição correta repetidamente.

public class OrdenacaoSelecao {
    public static int[] ordenacaoPorSelecao(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int menorIndice = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[menorIndice]) {
                    menorIndice = j;
                }
            }
            int temp = array[i];
            array[i] = array[menorIndice];
            array[menorIndice] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] numeros = {29, 10, 14, 37, 13};
        numeros = ordenacaoPorSelecao(numeros);
        for (int num : numeros) {
            System.out.print(num + " "); // Saída: 10 13 14 29 37
        }
    }
}
