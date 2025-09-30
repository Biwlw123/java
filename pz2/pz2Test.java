package pz2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PZ2Tests {

    @Test
    void testPointDistance() {
        assertEquals(5.0, PointDistance.calculateDistance(0, 0, 3, 4), 0.001);
        assertEquals(0.0, PointDistance.calculateDistance(1, 1, 1, 1), 0.001);
    }

    @Test
    void testArraySumCalculator() {
        int[] array = {1, 2, 3, 4, 5};
        ArraySumResult result = ArraySumCalculator.calculateEvenOddSum(array);
        assertEquals(6, result.getEvenSum());
        assertEquals(9, result.getOddSum());
    }

    @Test
    void testStringConcatenator() {
        assertEquals("HelloWorld", StringConcatenator.concatStrings("Hello", "World", "Java", "test", "test"));
        assertEquals("HelloJava", StringConcatenator.concatStrings("Hello", "World", "Java", "test1", "test2"));
    }

    @Test
    void testParityChecker() {
        assertTrue(ParityChecker.isEven(4));
        assertTrue(ParityChecker.isEven(0));
        assertTrue(ParityChecker.isEven(-2));
        assertFalse(ParityChecker.isEven(3));
        assertFalse(ParityChecker.isEven(-1));
    }

    @Test
    void testVectorOperations() {
        double[] a = {1, 2, 3};
        double[] b = {4, 5, 6};
        assertEquals(32.0, VectorOperations.dotProduct(a, b), 0.001);
        
        // Тест с заданными векторами
        double[] vectorA = {1e20, 1223, 1e18, 1e15, 3, 1e-12};
        double[] vectorB = {1e20, 2, 1e-22, 1e13, 2111, 1e16};
        double expected = 1e40 + 2446 + 1e-4 + 1e28 + 6333 + 1e4;
        assertEquals(expected, VectorOperations.dotProduct(vectorA, vectorB), 1e20);
    }

    @Test
    void testQuadraticEquation() {
        // Этот тест проверяет, что метод не выбрасывает исключения
        assertDoesNotThrow(() -> QuadraticEquation.solve(1, -3, 2));
        assertDoesNotThrow(() -> QuadraticEquation.solve(1, 2, 5));
        assertDoesNotThrow(() -> QuadraticEquation.solve(1, -4, 4));
    }
}
