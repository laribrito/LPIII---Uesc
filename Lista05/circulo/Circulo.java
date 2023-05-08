package Lista05.circulo;

// Construa uma classe Circulo com os seguintes requisitos:
// Nome da classe: Circulo
// Atributos: x (abscissa do centro), y (ordenada do centro), r (raio);
// Métodos:
// Constructor
// validaCirculo
// set/get,
// imprimirCirculo(),
// boolean isInnerPoint(Ponto2D), retorna verdadeiro se o ponto enviado como
// parâmetro es interno ao círculo, use como parâmetro um objeto ponto do
// exercício anterior.
// float area(), retorna a área do círculo
// float perimeter(), retorna o perímetro do círculo
// boolean isBiggerThan(Circulo), retorna verdadeiro se a área do objeto for maior
// que a área do círculo enviado como parâmetro.

public class Circulo {
    private Ponto2D centro;
    private float raio;

    Circulo(Ponto2D c, float r){
        centro = c;
        raio = r;
    }

    Circulo(Ponto2D c){
        this(c, 1);
    }

    Circulo(){
        this(new Ponto2D(0), 1);
    }

    public void imprimirCirculo(){
        System.out.print("Círculo de raio: "+ raio + " e centro ");
        centro.imprimirPonto();
    }

    public Ponto2D getCentro() {
        return centro;
    }

    public float getRaio() {
        return raio;
    }
}
