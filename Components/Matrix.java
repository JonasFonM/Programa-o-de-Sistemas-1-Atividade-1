package Components;

import java.util.Scanner;

public class Matrix {
    Scanner input = new Scanner(System.in);

    public int[][] createMatrix(char letra){
        System.out.flush();
        System.out.println("Informe o número de linhas para a Matriz"+letra+": ");
        int l = input.nextInt();
        System.out.println("Informe o número de colunas para a Matriz"+letra+": ");
        int c = input.nextInt();

        int matrix[][] = new int[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {          
                System.out.println("Informe o próximo número da Matriz "+letra+":");
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

    
    
}
