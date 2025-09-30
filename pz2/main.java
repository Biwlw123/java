package pz2;

public class Main {
    public static void mainn(String[] args)
    {
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

     System.out.println("\nЗадание 4: Проверка четности без %");
        int number1 = 10;
        int number2 = 15;
        System.out.println(number1 + " четное? " + ParityChecker.isEven(number1));
        System.out.println(number2 + " четное? " + ParityChecker.isEven(number2));

     System.out.println("\n Задание 5: Скалярное произведение векторов");
        double[] vectorA = {1e20, 1223, 1e18, 1e15, 3, 1e-12};
        double[] vectorB = {1e20, 2, 1e-22, 1e13, 2111, 1e16};
        double dotProduct = VectorOperations.dotProduct(vectorA, vectorB);
        System.out.printf("Скалярное произведение: %e%n", dotProduct);
     System.out.println("\nЗадание 6: Решение квадратного уравнения");
        QuadraticEquation.solve(1, -3, 2);  
        QuadraticEquation.solve(1, 2, 5);   
        QuadraticEquation.solve(1, -4, 4);  
    
    }
}