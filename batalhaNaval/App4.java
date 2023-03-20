package batalhaNaval;
public class App4 {
    public static void main(String[] args) {
        intro();
        //variaveis e objetos
        Jogador player1 = new Jogador(1);
        Jogador player2 = new Jogador(2);
    }

    public static void intro(){
        limpaTela();
        System.out.println("\tWelcome to Battleship!!!");
        System.out.println("\n\n\n");
        aguarde(2);
        limpaTela();
    }

    public static void limpaTela(){
        for (short i = 1; i<100; i++) System.out.println("\n");
    }

    public static void aguarde(int segundos){
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
