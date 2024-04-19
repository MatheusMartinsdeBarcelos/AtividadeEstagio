import java.util.Scanner;

public class atividade05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string para ser invertida:");
        String original = scanner.nextLine();
        String invertida = inverterString(original);
        System.out.println("String invertida: " + invertida);
        scanner.close();
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray(); 
        int n = caracteres.length;
        char[] invertida = new char[n];

        for (int i = 0; i < n; i++) {
            invertida[n - 1 - i] = caracteres[i];
        }
        return new String(invertida); 
    }
}