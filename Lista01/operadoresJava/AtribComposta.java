package Lista01.operadoresJava;

public class AtribComposta {
    public static void main(String[] args) {
        int a = 2, b = 3, c=10;

        a+=b;
        System.out.println("Soma: " + a);

        a-=b;
        System.out.println("Subtração: " + a);

        a*=b;
        System.out.println("Multiplicação: " + a);

        a/=b;
        System.out.println("Divisão: " + a);

        a%=b;
        System.out.println("Módulo: " + a);

        a&=c;
        System.out.println("And bit a bit: " + a);

        a|=2;
        System.out.println("Or bit a bit: " + a);

        a^=c;
        System.out.println("Xor bit a bit: " + a);

        a>>=1;
        System.out.println("Right shift bit a bit: " + a);

        a>>>=2;
        System.out.println("Right shift sem sinal bit a bit: " + a);

        a<<=2;
        System.out.println("Left shift bit a bit: " + a);
    }
}
