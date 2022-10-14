import java.util.Scanner;
public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;
        

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero > maior) maior = numero;

            soma = soma + numero;
            count++;
        } while (count < 5);
        
        System.out.println("Maior Número: " + maior);
        System.out.println("Média: " + soma/5);
        
    }
}
