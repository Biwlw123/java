package pz2;

public class Main {
    public static void mainn(String[] args)
     System.out.println("Задание 1: Расстояние между точками");
        double distance = PointDistance.calculateDistance(1, 2, 4, 5);
        System.out.printf("Расстояние между точками (1,2) и (4,5): %.2f%n", distance);

     System.out.println("\nЗадание 2: Сумма четных и нечетных элементов");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArraySumResult sumResult = ArraySumCalculator.calculateEvenOddSum(array);
        System.out.println("Массив: " + java.util.Arrays.toString(array));
        System.out.println("Сумма четных: " + sumResult.getEvenSum());
        System.out.println("Сумма нечетных: " + sumResult.getOddSum());

     System.out.println("\nЗадание 3: Конкатенация строк по условию");
        String result1 = StringConcatenator.concatStrings("Hello", "World", "Java", "test", "test");
        System.out.println("Случай когда s4 == s5: " + result1);
        
        String result2 = StringConcatenator.concatStrings("Hello", "World", "Java", "test1", "test2");
        System.out.println("Случай когда s4 != s5: " + result2);
}