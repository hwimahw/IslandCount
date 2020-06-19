package ru.nsd.objects;

import ru.nsd.objectsinitializers.MatrixInitializer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrix {
    private int n;
    private int m;
    private char[][] arrayMatrix;
    private MatrixInitializer matrixInitializer = new MatrixInitializer();

    public Matrix() throws Exception {
        InputStream inputStream = new FileInputStream("./src/main/resources/input.txt");
        matrixInitializer.matrixInitialize(inputStream, this);
    }

    public Matrix(int n, int m, char[][] arrayMatrix) {
        this.n = n;
        this.m = m;
        this.arrayMatrix = arrayMatrix;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setArrayMatrix(char[][] arrayMatrix) {
        this.arrayMatrix = arrayMatrix;
    }

    public char[][] getArrayMatrix() {
        return arrayMatrix;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arrayMatrix[i][j]);
                if (j == (m - 1)) {
                    //sb.append('\n');
                }
            }
        }
        return sb.toString();
    }

    public int quantityOfDots() {
        int quantityOfDots = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arrayMatrix[i][j] == '.') {
                    quantityOfDots++;
                }
            }
        }
        return quantityOfDots;
    }
}