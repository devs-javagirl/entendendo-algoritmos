package capitulo03;

public class Recursao {
    public static int fatorial(int n) {
        if (n == 1) return 1;
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fatorial(5)); // Saída: 120
    }
}
