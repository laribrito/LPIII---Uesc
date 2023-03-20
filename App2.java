import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] valores = new float[10];
        float soma = 0;
        float media = 0;
        float desvio = 0;
        
        // Lendo os valores
        System.out.println("Digite 10 valores float:");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextFloat();
            soma += valores[i];
        }
        
        // Calculando a média
        media = soma / valores.length;
        System.out.println("Média: " + media);
        
        // Calculando o desvio padrão
        for (int i = 0; i < valores.length; i++) {
            desvio += Math.pow(valores[i] - media, 2);
        }
        desvio = (float) Math.sqrt(desvio / (valores.length - 1));
        System.out.println("Desvio padrão: " + desvio);
        sc.close();
    }
}