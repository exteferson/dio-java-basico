package edu.primeirasemana;
public class MinhaClasse {

public static void main (String [] args){

    String primeiroNome = "Esteferson";
    String segundoNome = "Quadros";
    
    String nomeCompleto = juntarNomes(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
}
 public static String juntarNomes (String primeiroNome, String segundoNome){
    //return primeiroNome.concat(" ").concat(segundoNome);
    return "Resultado do Método: " + primeiroNome + " " + segundoNome;

 }
    
}
