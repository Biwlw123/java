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