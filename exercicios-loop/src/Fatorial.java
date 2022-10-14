import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Fatorial{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int numero = scan.nextInt();

        int fatorial = 1;

        
        for(int i = numero ; i >= 1 ; i --) {
            fatorial = fatorial * i;
        }

        System.out.println(numero + "! = " + fatorial);
    }
}