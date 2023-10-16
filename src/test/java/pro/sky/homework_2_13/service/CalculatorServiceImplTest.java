package pro.sky.homework_2_13.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    void calculator_success() {

        String expectedMessage = "Добро пожаловать в калькулятор!"; // ожидаемый результат

        String actualMessage = calculatorService.calculator(); // фактический результат

        assertEquals(expectedMessage, actualMessage); // сравниваем результаты
    }

    @Test
    void plus_success() {

        int a = 5;
        int b = 10;
        int res = a + b;

        String expectedResult = a + " + " + b + " = " + res; // ожидаемый результат

        String actualResult = calculatorService.plus(a, b); // фактический результат

        assertEquals(expectedResult, actualResult); // сравнение результатов
    }

    @Test
    void minus_success() {

        int a = 5;
        int b = 10;
        int res = a - b;

        String expectedResult = a + " - " + b + " = " + res; // ожидаемый результат

        String actualResult = calculatorService.minus(a, b); // фактический результат

        assertEquals(expectedResult, actualResult); // сравнение результатов
    }

    @Test
    void multiply_success() {

        int a = 5;
        int b = 10;
        int res = a * b;

        String expectedResult = a + " * " + b + " = " + res; // ожидаемый результат

        String actualResult = calculatorService.multiply(a, b); // фактический результат

        assertEquals(expectedResult, actualResult); // сравнение результатов
    }

    @Test
    void divide_success() {

        int a = 10;
        int b = 5;
        int res = a / b;

        String expectedResult = a + " / " + b + " = " + res; // ожидаемый результат

        String actualResult = calculatorService.divide(a, b); // фактический результат

        assertEquals(expectedResult, actualResult); // сравнение результатов
    }

    @Test
    void divide_exception_test() {

        int a = 10;
        int b = 0;

        String expectedMessage = "Ошибка! На ноль делить нельзя!"; // ожидаемый результат

        Exception exception = assertThrows( // фактический результат
                IllegalArgumentException.class,
                () -> calculatorService.divide(a, b)
        );
        assertEquals(expectedMessage, exception.getMessage()); // сравнение результатов
    }
}