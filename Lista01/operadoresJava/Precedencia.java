package Lista01.operadoresJava;

public class Precedencia {
    public static void main(String[] args) {
        int a,b,c;
        
        // primeira expressão - sem parenteses
        a = 1; b = 4; c = 1;
        int primeira = a - b % ++c >> 1;
        System.out.println("Sem parênteses: "+primeira);

        // segunda expressão - com parenteses
        a = 1; b = 4; c = 1;
        int segunda = (a - ((b % ++c) >> 1));
        System.out.println("Com parênteses: "+segunda);

        // terceira expressão - com parenteses, explicitando a sequência da primeira
        a = 1; b = 4; c = 1;
        int terceira = ((a - (b % ++c)) >> 1);
        System.out.println("Com parênteses, como a primeira: "+terceira);
    }
}
