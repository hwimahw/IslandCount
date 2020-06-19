package ru.nsd.objects;

import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixTest {
    @Test
    public void toStringTest(){
        char[][] array = {{'#', '#', '.'}, {'.', '.', '#'}};
        Matrix matrix = new Matrix(2, 3, array);
        String expected = "##...#";
        assertEquals(expected, matrix.toString());
    }

    @Test
    public void quantityOfDotsTest(){
        char[][] array = {{'#', '#', '.'}, {'.', '.', '#'}};
        Matrix matrix = new Matrix(2, 3, array);
        int expected = 3;
        assertEquals(expected, matrix.quantityOfDots());
    }
}
