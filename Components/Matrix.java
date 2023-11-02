package Components;

import java.util.Scanner;

public class Matrix {
    Scanner input = new Scanner(System.in);

    public int[][] createMatrix(char letra){
        System.out.flush();
        System.out.println("Informe o número de linhas para a Matriz "+letra+": ");
        int l = input.nextInt();
        System.out.println("Informe o número de colunas para a Matriz "+letra+": ");
        int c = input.nextInt();

        int matrix[][] = new int[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {          
                System.out.println("Informe o próximo número da Matriz "+letra+": ");
                matrix[i][j] = input.nextInt();
            }
        }

        return(matrix);         
    }

    public boolean compareMatrix(int[][] A, int[][] B){
        if (B.length == A[0].length) {
            System.out.println("A multiplicação entre as matrizes A e B é possível!");
            return(true);          
        } else{
            System.out.println("A multiplicação entre as matrizes A e B não é possível!");
            return(false);
        }
        
        
    }

    public int[][] multiplyMatrix(int[][] A, int[][] B){
        int C[][] = new int[A.length][B[0].length];
        if(B.length == A[0].length) {
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int j2 = 0; j2 < A[0].length; j2++) {
                        C[i][j] += A[i][j2] * B[j2][j];
                    }
                }
            }
        }
        return(C);
    }       

    public void readMatrix(int[][] M){                       
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    }

}
