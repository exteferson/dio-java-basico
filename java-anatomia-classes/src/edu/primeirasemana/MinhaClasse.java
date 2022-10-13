package edu.primeirasemana;
public class MinhaClasse {

public static void main (String [] args){

    String primeiroNome = "Esteferson";
    String segundoNome = "Quadros";
    
    String nomeCompleto = juntarNomes(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);

//Testando incremento e Decremento:
    int numero1 = 5, numero2 = 3;
    numero1++;
    numero2--;
    System.out.println(numero1);
    System.out.println(numero2);
}
 public static String juntarNomes (String primeiroNome, String segundoNome){
    //return primeiroNome.concat(" ").concat(segundoNome);
    return "Resultado do Método: " + primeiroNome + " " + segundoNome;

 }
    
}
