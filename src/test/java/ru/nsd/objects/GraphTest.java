package ru.nsd.objects;

import org.junit.Test;
import org.junit.*;

public class GraphTest {

    public static char[][] array = {{'#', '#', '.'}, {'.', '.', '#'}, {'#', '#', '#'}};
    public static Matrix matrix;
    public static Graph graph;

    @BeforeClass
    public static void init() {
        matrix = new Matrix(2, 3, array);
        graph = new Graph(matrix);
    }

    @Test
    public void toStringTest() {
        graph.setArrayGraph(array);
        graph.setN(3);
        String expected = "##...####";
        Assert.assertEquals(expected, graph.toString());
    }

    @Test
    public void toOneDemensionalArrayTest() {
        graph.setArrayGraph(array);
        graph.setN(3);
        char[] expectedArray = {'#', '#', '.', '.', '.', '#', '#', '#', '#'};
        Assert.assertArrayEquals(expectedArray, graph.toOneDimensionalArray());
    }

    @Test
    public void quantityOfIslands() {
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, graph.quantityOfIslands());
    }
}
