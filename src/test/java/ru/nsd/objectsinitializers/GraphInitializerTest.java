package ru.nsd.objectsinitializers;

import org.junit.Test;
import ru.nsd.objects.Graph;
import ru.nsd.objects.Matrix;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GraphInitializerTest {
    GraphInitializer graphInitializer = new GraphInitializer();

    @Test
    public void graphInitializeTest(){
        char[][] array = {{'#', '#'}, {'.', '.'}};
        Matrix matrix = new Matrix(2, 2, array);
        Graph graph = new Graph(matrix);

        assertEquals(4, graph.getN());
        assertEquals("1100110000000000", graph.toString());
    }
}
