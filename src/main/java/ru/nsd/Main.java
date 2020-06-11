package ru.nsd;

import ru.nsd.objects.Graph;
import ru.nsd.objects.Matrix;

public class Main {
    public static void main(String[] args) throws Exception {
        Matrix matrix = new Matrix();
        System.out.println(matrix.toString());
        Graph graph = new Graph(matrix);
        System.out.println(graph.quantityOfIslands(graph)- matrix.quantityOfDots());
    }
}
