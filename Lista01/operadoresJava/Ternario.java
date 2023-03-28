package Lista01.operadoresJava;

public class Ternario {
    public static void main(String[] args) {
        int idade = 18;
        System.out.println(idade>=18?"Maior de idade":"Menor de idade");

        int idade2 = 15;
        Boolean maiorIdade = idade2>=18?true:false;
        System.out.println("É maior de idade? "+ maiorIdade);
    }
}
