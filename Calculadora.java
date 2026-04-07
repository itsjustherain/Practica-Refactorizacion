public class Calculadora {
    public void imprimirSuma(int numeroUno, int numeroDos) {
        int resultado = sumar(numeroUno, numeroDos);
        System.out.println("Resultado: " + resultado);
    }

    private int sumar(int numeroUno, int numeroDos) {
        int resultado = numeroUno + numeroDos;
        return resultado;
    }
}