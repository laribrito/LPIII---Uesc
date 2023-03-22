package lista1;
import java.util.Scanner;

// jogo do crabs
public class App3 {

    public static void main(String[] args) {
        //variaveis e objetos
        int dado1, dado2, soma, ponto;
        short count;

        Scanner input = new Scanner(System.in);

        //primeiro estagio
        System.out.println("Estágio 1:");
        System.out.print("\nDado1: ");
        dado1 = input.nextInt();
        System.out.print("Dado2: ");
        dado2 = input.nextInt();

        soma = dado1 + dado2;
        if (soma == 7 && soma == 11) {
            System.out.println("Venceu");
        } else if (soma == 2 && soma ==3 && soma ==12){
            System.out.println("Perdeu");
        } else {
            //segundo estágio
            ponto = soma;
            
            System.out.println("\n\nEstágio 2:");
            System.out.print("Ponto: " + ponto);
            count = 1;
            do{
                System.out.print("\nDado1: ");
                dado1 = input.nextInt();
                System.out.print("Dado2: ");
                dado2 = input.nextInt();
                soma = dado1+dado2;
                System.out.println("Jogada "+ count + ": " + soma);

                if (soma ==7 ){
                    System.out.println("Perdeu");
                } else if(soma == ponto) {
                    System.out.println("Venceu");
                } else {
                    count++;
                }
            }while(soma != ponto && soma !=7);
        }

        input.close();
    }
}