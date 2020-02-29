import java.util.Scanner;

public class dependacies {


    public static void matrix(float[][] mat, int row, int col, float[][] mat1, int col1, int row1) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array 1---------------------------------------------------------------\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Masukkan data untuk array baris " + i + " kolom " + j + "\n");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Array 2---------------------------------------------------------------\n");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print("Masukkan data untuk array baris " + i + " kolom " + j + "\n");
                mat1[i][j] = sc.nextInt();
            }
        }
    }


    public static void print(float[][] mat, int row, int col, float[][] mat1, int col1, int row1) {
        System.out.print("Array 1---------------------------------------------------------------\n");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Array baris " + i + " kolomn " + j + " = " + mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Array 2---------------------------------------------------------------\n");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print("Array baris " + i + " kolomn " + j + " = " + mat1[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void sum(float[][] mat, int row, int col, float[][] mat1, int col1, int row1) {
        float[][] temp= new float[10000][10000];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j] = mat1[i][j] + mat[i][j];
                System.out.print("Array baris " + i + " kolom " + j + " = " + temp[i][j] + "\n");
            }
        }
    }

    public static void mult(float[][] mat, int row, int col, float[][] mat1, int col1, int row1) {
        float[][] temp = new float[10000][10000];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col1; j++) {
                float sum = 0;
                for (int k = 0; k < row1; k++) {
                    sum += mat[i][k] * mat1[k][j];
                }
                temp[i][j] = sum;
            }
        }   
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print("array baris " + i + " kolomn " + j + " = " + temp[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
