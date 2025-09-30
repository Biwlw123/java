package pz1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CircleCalculatorTest {
    
    private final CircleCalculator calculator = new CircleCalculator();
    
    @Test
    public void testDoWorkWithPositiveRadius() {
        double radius = 5.0;
        double expected = Math.PI * 5.0 * 5.0;
        double actual = calculator.doWork(radius);
        
        assertEquals(expected, actual, 0.001, "Площадь окружности вычислена неверно");
    }
    
    @Test
    public void testDoWorkWithZeroRadius() {
        double result = calculator.doWork(0);
        assertEquals(0, result, 0.001, "Площадь при нулевом радиусе должна быть 0");
    }
    
    @Test
    public void testDoWorkWithNegativeRadius() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.doWork(-1);
        }, "Должно выбрасываться исключение для отрицательного радиуса");
    }
    
    @Test
    public void testDoWorkWithDecimalRadius() {
        double radius = 2.5;
        double expected = Math.PI * 2.5 * 2.5;
        double actual = calculator.doWork(radius);
        
        assertEquals(expected, actual, 0.001, "Площадь с дробным радиусом вычислена неверно");
    }
}