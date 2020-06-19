package ru.nsd.objectsinitializers;

import org.junit.Test;
import ru.nsd.objects.Graph;
import ru.nsd.objects.Matrix;

import static org.junit.Assert.assertEquals;

public class MatrixInitializerTest {

    @Test
    public void matrixInitializeTest() throws Exception{
        Matrix matrix = new Matrix();
        assertEquals(3, matrix.getN());
        assertEquals(3, matrix.getM());
        assertEquals("#...#...#", matrix.toString());
    }
}
