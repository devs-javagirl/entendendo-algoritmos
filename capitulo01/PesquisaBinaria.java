public class PesquisaBinaria {
    // função que faz a pesquisa
    public static int buscaBinaria(int[] lista, int valor) {
        int baixo = 0;
        int alto = lista.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];

            if (chute == valor) {
                return meio;
            }

            if (chute > valor) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }

        return -1; // valor não encontrado
    }

    public static void main(String[] args) {
        int[] lista = {1, 3, 5, 7, 9}; // lista precisa estar ordenada
        int resultado = buscaBinaria(lista, 3);

        if (resultado != -1) {
            System.out.println("Valor encontrado no índice: " + resultado);
        } else {
            System.out.println("Valor não encontrado na lista.");
        }
    }
}