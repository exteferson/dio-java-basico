package edu.segundasemana;

public class Operadores {
    public static void main(String[] args) {
// Teste com Operadores Ternários;
        int a, b;
        
        a = 5;
        b = 5;
        
/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
*/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);

// Teste com Operadores Relacionais;
        int numero1 = 2;
        int numero2 = 5;

        boolean simNao = numero1 == numero2;
        System.out.println ("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println ("numero1 é igual a numero2? " + simNao);

    }
}
