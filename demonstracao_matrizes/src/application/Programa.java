package application;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int n = sc.nextInt();

        int [][] mat = new int [n][n];

        for (int i=0; i < mat.length; i++){
            for (int j=0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("A diagonal principal é: ");
        for (int i=0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        int count = 0;

        for (int i=0; i < mat.length; i++){
            for (int j=0; j < mat[i].length; j++){
                if (mat[i][j] < 0);{
                    count++;
                }
            }
        }
        System.out.println("Números negativos: " + count);

        sc.close();
    }
}
