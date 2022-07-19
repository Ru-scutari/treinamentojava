package application;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas: ");
        int m = sc.nextInt();
        System.out.println("Digite a quantidade de colunas: ");
        int n = sc.nextInt();

        int [][] matriz = new int [m][n];

        for (int l=0; l < matriz.length; l++){
            for (int c = 0; c <matriz[l].length; c++){
                matriz[l][c]=sc.nextInt();
            }
        }

        System.out.println("Digite um número inteiro: ");
        int x = sc.nextInt();

        for (int l=0; l < matriz.length; l++){
            for (int c=0; c < matriz[l].length; c++){
                if (matriz[l][c] == x){
                    System.out.println("Posição: " + l + "," + c);
                    System.out.println("Esquerda: " + matriz [l] [c-1]);
                    System.out.println("Direita: " + matriz [l] [c+1]);
                    System.out.println("Abaixo: " + matriz [l+1] [c]);
                    System.out.println("Acima: " + matriz [l-1] [c]);
                }
            }
        }

        sc.close();
    }
}
