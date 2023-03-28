# Operadores Bit a Bit

Funcionam de forma similar ao C, analisando números inteiros bit por bit. No Java há 6 operadores bit a bit, utilizados com números inteiros. São eles:

+ Not ' ~ '

A sua tabela verdade é a mesma do NOT lógico.

+ And ' & '

A sua tabela verdade é a mesma do AND lógico: o resultado é verdade se os dois bits comparados forem '1'.

+ Or ' | '

A sua tabela verdade é a mesma do OR lógico: o resultado é verdade se algum dos dois bits comparados forem '1'.
+ Xor ' ^ '

A sua tabela verdade é a mesma do XOR lógico: o resultado é verdade se os dois bits comparados forem diferentes.
+ Right Shift " >> n "

Esse operador desloca para a direita a quantidade n de bits, mantendo o bit de sinal e adicionando 0 nos locais vazios, à esquerda.
+ Right Shift Sem Sinal" >>> n "

Esse operador desloca para a direita a quantidade n de bits, ignorando o bit de sinal e adicionando 0 nos locais vazios, à esquerda.
+ Left Shift " << "

Esse operador desloca para a esquerda a quantidade n de bits, ignorando o bit de sinal e adicionando 0 nos locais vazios, à direita.

<a href="https:///www.github.com/laribrito/LPIII-Uesc/tree/main/Lista01/operadoresJava/BitBit.java"> Veja exemplos </a></br>
<a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html"> Documentação </a></br>
<a href="https://acervolima.com/operadores-bit-a-bit-em-java/"> Site auxiliar </a>

# Atribuição composta

Atribuição associadas a alguma operação, em uma escrita mais simplificada. *Ex.: a = a + b -> a += b*. Operações aritiméticas e binárias podem ser realizadas assim em java:

+ '+=' (soma)
+ '-='  (subtração)
+ '*=' (multiplicação)
+ '/=' (divisão)
+ '%=' (módulo)
+ '&=' (and bit a bit)
+ '|=' (or bit a bit)
+ '^=' (xor bit a bit)
+ '>>=' (right shift bit a bit)
+ '>>>=' (right shift sem sinal bit a bit)
+ '<<=' (left shift bit a bit)

<a href="https:///www.github.com/laribrito/LPIII-Uesc/tree/main/Lista01/operadoresJava/AtribComposta.java"> Veja exemplos </a></br>
Não achei na documentação</br>
<a href="https://acervolima.com/operadores-de-atribuicao-compostos-em-java/"> Site auxiliar </a>

# Precedência de operadores

Segue semelhante as regras da matemática. Independente dos operadores, os parênteses tem total prioridade, dos mais internos para os mais externos, para indexação, cast, funções ou cálculo, seguido das seguintes operações: 

1. Operadores unários
2. Multiplicação, divisão e módulo
3. Adição e subtração
4. Right e left shift
5. Relacionais (maior, menor e derivados)
6. Igualdade
7. And, Or e Xor bit a bit
9. And e Or condicional
10. Operador unário
11. Atribuição

Se mais de um operador de mesma prioridade aparecerem, o que aparecer mais à esquerda é calculado primeiro.

<a href="https:///www.github.com/laribrito/LPIII-Uesc/tree/main/Lista01/operadoresJava/Precedencia.java"> Veja exemplos </a></br>
Não achei na documentação</br>
<a href="https://www.dm.ufscar.br/~waldeck/curso/java/part25.html"> Site auxiliar </a>

# Operador Ternário

Uma forma simplificada de escrever um if-else curto. Muito utilizado na atribuição de uma variável.

> expressão booleana ? código 1 : código 2;

<a href="https:///www.github.com/laribrito/LPIII-Uesc/tree/main/Lista01/operadoresJava/Ternario.java"> Veja exemplos </a></br>
<a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html"> Documentação </a>
