package exercicios;

import java.util.Scanner;

public class ex001 {

    public static void main(String[] args) {
        
        /*
         * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
         * soma desses números com uma mensagem explicativa.
         */

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        System.out.printf("SOMA = %d ", soma);

        sc.close();

    }

}
