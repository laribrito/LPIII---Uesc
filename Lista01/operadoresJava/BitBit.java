package Lista01.operadoresJava;

public class BitBit {
    public static void main(String[] args) {
        // 3  = 0000.0011
        // 10 = 0000.1010
        int a = 3, b = 10;

        System.out.print("Início -> ");
        exibe(a, b);

        // operador not
        // 3  = 0000.0011
        // not= 1111.1100 (-4, pelo complemento a dois)
        System.out.println("Not bit a bit -> "+ (~a));

        // operador and
        // 3  = 0000.0011
        // 10 = 0000.1010
        // and= 0000.0010 (2)
        System.out.println("And bit a bit -> "+ (a&b));

        // operador or
        // 3  = 0000.0011
        // 10 = 0000.1010
        // or = 0000.1011 (11)
        System.out.println("Or bit a bit -> "+ (a|b));

        // uso do operador xor
            // troca de valores
        
        // a = 0000.0011
        // b = 0000.1010
        a^=b;
        // a = 0000.1001
        // b = 0000.1010
        b^=a;
        // a = 0000.1001
        // b = 0000.0011
        a^=b;
        // a = 0000.1010
        // b = 0000.0011
        System.out.print("Xor bit a bit -> ");
        exibe(a, b);

        // operador >>
        System.out.println("Operador >> -> "+ (a>>2));

        // operador >>>
        System.out.println("Operador >>> -> "+ (a>>>2));

        // operador <<
        System.out.println("Operador << -> "+ (a<<2));
    }

    // método para exibir as variáveis
    public static void exibe(int a, int b){
        System.out.println("A: "+a+ "; B: "+b);
    }
}
