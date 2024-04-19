public class atividade02 {
    public static void main(String[] args) {
        int limite = 100; 
        int numeroParaVerificar = 21; 
        boolean pertenceFibonacci = false; 

        int anterior = 0;
        int atual = 1;

        if (numeroParaVerificar == anterior || numeroParaVerificar == atual) {
            pertenceFibonacci = true;
        }
        while (atual <= limite) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            if (numeroParaVerificar == atual) {
                pertenceFibonacci = true;
                break;
            }
        }

        if (pertenceFibonacci) {
            System.out.println(numeroParaVerificar + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numeroParaVerificar + " não pertence à sequência de Fibonacci.");
        }
    }
}

