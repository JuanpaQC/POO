public class Factorial {
    public static void main(String[] args) {
        int n = 100; // Cambia este valor al número que deseas calcular su factorial
        long factorial = 1;

        for(int i = 1; i <= n; ++i) {
            factorial *= i;
        }

        System.out.printf("Factorial de %d = %d", n, factorial);
    }
}