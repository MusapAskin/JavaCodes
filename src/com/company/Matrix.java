package com.company;

import java.util.Scanner;

 class MatrixArrays {
    int row,column;
    int matrix[][];

    void create(){
        Scanner in = new Scanner(System.in);
        System.out.println("Number of rows: ");
        row = Integer.parseInt(in.nextLine());

        System.out.println("Number of column: ");
        column = Integer.parseInt(in.nextLine());

        matrix = new int[row][column];

        System.out.println("Enter datas : ");
        for(int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                matrix[i][j]=in.nextInt();
            }
        }
        in.close();
    }
     void display() {
        System.out.println("Matrix is :");
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("\n");
        }
     }
}

public class Matrix{
    public static void main(String[] args){
        MatrixArrays m = new MatrixArrays();
        m.create();
        m.display();
    }
}
