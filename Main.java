import Components.Matrix;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Você deseja multiplicar um par de Matrizes? \n 1-> Sim\n 2-> Não");
        int answ = input.nextInt();
        
        while (answ == 1) {           
            Matrix mkMatrix = new Matrix();
        
            int[][] matrixA = mkMatrix.createMatrix('A');
            int[][] matrixB = mkMatrix.createMatrix('B');

            boolean isPossible = mkMatrix.compareMatrix(matrixA,matrixB);
        
            if (isPossible == true) {
                int[][] matrixC =  mkMatrix.multiplyMatrix(matrixA, matrixB);

                System.out.println("A multiplicação da Matriz A ");
                mkMatrix.readMatrix(matrixA);
                System.out.println("Com a Matriz B ");
                mkMatrix.readMatrix(matrixB);
                System.out.println("Resultou na Matriz C ");
                mkMatrix.readMatrix(matrixC);
            }
            
            System.out.println("Deseja fazer multiplicar um novo par de Matrizes?\n 1-> Sim\n 2-> Não");
            answ = input.nextInt();
        }   
        input.close();
    } 
    
}