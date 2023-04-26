package questao3;

public class App3 {
    public static void main(String[] args) {
        LampadaLuzVariavel lampadaSala = new LampadaLuzVariavel();
        
        lampadaSala.acende(53);
        lampadaSala.mostraEstadoAtual();
        System.out.println("Com o nível em "+ lampadaSala.getNivelLuz() + ", a lâmpada está ligada? "+ lampadaSala.estaLigada());

        lampadaSala.apaga();
        System.out.println("Com o nível em "+ lampadaSala.getNivelLuz() + ", a lâmpada está ligada? "+ lampadaSala.estaLigada());
    }
}
