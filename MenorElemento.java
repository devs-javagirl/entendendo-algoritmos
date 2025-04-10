// Exercício 2: Encontre o menor elemento de uma lista
// A maneira mais simples de encontrar o menor elemento é percorrer toda a lista e manter o menor valor encontrado.
// Implementação em Java:

public class MenorElemento {
    public static int encontrarMenor(int[] lista) {
        int menor = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] < menor) {
                menor = lista[i];
            }
        }
        return menor;
    }
    
    public static void main(String[] args) {
        int[] numeros = {4, 2, 9, 1, 5};
        System.out.println("O menor elemento é: " + encontrarMenor(numeros)); // Saída: 1
    }
}
