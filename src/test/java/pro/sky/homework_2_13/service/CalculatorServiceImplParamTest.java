package pro.sky.homework_2_13.service;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParamTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> plusParameters() {
        return Stream.of(
                Arguments.of("2", "4", "2 + 4 = 6"),
                Arguments.of("5", "5", "5 + 5 = 10"),
                Arguments.of("3", "9", "3 + 9 = 12"),
                Arguments.of("1", "6", "1 + 6 = 7")
        );
    }

    public static Stream<Arguments> minusParameters() {
        return Stream.of(
                Arguments.of("2", "4", "2 - 4 = -2"),
                Arguments.of("5", "5", "5 - 5 = 0"),
                Arguments.of("9", "3", "9 - 3 = 6"),
                Arguments.of("10", "0", "10 - 0 = 10")
        );
    }

    public static Stream<Arguments> multiplyParameters() {
        return Stream.of(
                Arguments.of("2", "4", "2 * 4 = 8"),
                Arguments.of("5", "5", "5 * 5 = 25"),
                Arguments.of("9", "3", "9 * 3 = 27"),
                Arguments.of("10", "0", "10 * 0 = 0")
        );
    }

    public static Stream<Arguments> divideParameters() {
        return Stream.of(
                Arguments.of("4", "2", "4 / 2 = 2"),
                Arguments.of("5", "5", "5 / 5 = 1"),
                Arguments.of("9", "3", "9 / 3 = 3"),
                Arguments.of("10", "1", "10 / 1 = 10")
        );
    }

    @ParameterizedTest
    @MethodSource("plusParameters")
    void plus(int a, int b, String res) {
        assertEquals(res, calculatorService.plus(a, b));
    }

    @ParameterizedTest
    @MethodSource("minusParameters")
    void minus(int a, int b, String res) {
        assertEquals(res, calculatorService.minus(a, b));
    }

    @ParameterizedTest
    @MethodSource("multiplyParameters")
    void multiply(int a, int b, String res) {
        assertEquals(res, calculatorService.multiply(a, b));
    }

    @ParameterizedTest
    @MethodSource("divideParameters")
    void divide(int a, int b, String res) {
        assertEquals(res, calculatorService.divide(a, b));
    }
}