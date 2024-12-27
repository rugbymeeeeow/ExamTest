package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            testPositiveNumbers();
            testNegativeNumbers();
            testMixedNumbers();
            testSingleElementArray();
            testThrowsExceptionForEmptyArray();
            System.out.println("Все тесты успешно пройдены!");
        } catch (AssertionError e) {
            System.err.println("Ошибка в тестах: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Произошло исключение: " + e.getMessage());
        }
    }




























    public static void testPositiveNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        assert ArrayUtils.findMax(array) == 5 : "Ошибка в testPositiveNumbers";
    }

    public static void testNegativeNumbers() {
        int[] array = {-1, -2, -3, -4, -5};
        assert ArrayUtils.findMax(array) == -1 : "Ошибка в testNegativeNumbers";
    }

    public static void testMixedNumbers() {
        int[] array = {-10, 0, 10, 5};
        assert ArrayUtils.findMax(array) == 10 : "Ошибка в testMixedNumbers";
    }

    public static void testSingleElementArray() {
        int[] array = {42};
        assert ArrayUtils.findMax(array) == 42 : "Ошибка в testSingleElementArray";
    }

    public static void testThrowsExceptionForEmptyArray() {
        int[] array = {};
        try {
            ArrayUtils.findMax(array);
            throw new AssertionError("Ошибка в testThrowsExceptionForEmptyArray: исключение не выброшено");
        } catch (IllegalArgumentException e) {
        }
    }
}