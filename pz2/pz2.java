package pz2;

public class PointDistance {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

public class ArraySumCalculator {
    public static ArraySumResult calculateEvenOddSum(int[] array) {
        int evenSum = 0;
        int oddSum = 0;
        
        for (int num : array) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        
        return new ArraySumResult(evenSum, oddSum);
    }
}
class ArraySumResult {
    private final int evenSum;
    private final int oddSum;
    
    public ArraySumResult(int evenSum, int oddSum) {
        this.evenSum = evenSum;
        this.oddSum = oddSum;
    }
    
    public int getEvenSum() {
        return evenSum;
    }
    
    public int getOddSum() {
        return oddSum;
    }
}

public class StringConcatenator {
    public static String concatStrings(String s1, String s2, String s3, String s4, String s5) {
        if (s4.equals(s5)) {
            return s1 + s2;
        } else {
            return s1 + s3;
        }
    }
}
public class ParityChecker {
    public static boolean isEven(int number) {
        // Используем побитовую операцию AND
        return (number & 1) == 0;
    }
}

public class VectorOperations {
    public static double dotProduct(double[] vectorA, double[] vectorB) {
        if (vectorA.length != vectorB.length) {
            throw new IllegalArgumentException("Векторы должны иметь одинаковую длину");
        }
        
        double result = 0.0;
        for (int i = 0; i < vectorA.length; i++) {
            result += vectorA[i] * vectorB[i];
        }
        return result;
    }
}


public class QuadraticEquation {
    public static void solve(double a, double b, double c) {
        System.out.printf("Уравнение: %.1fx² + %.1fx + %.1f = 0%n", a, b, c);
        
        if (a == 0) {
            System.out.println("Это не квадратное уравнение (a = 0)");
            return;
        }
        
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Два различных корня: x1 = %.2f, x2 = %.2f%n", x1, x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.printf("Один корень: x = %.2f%n", x);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Два комплексных корня: x1 = %.2f + %.2fi, x2 = %.2f - %.2fi%n", 
                            realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}
