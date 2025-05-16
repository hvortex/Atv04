public class Fatorial {
    public static long calcular(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo.");
        }

        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}