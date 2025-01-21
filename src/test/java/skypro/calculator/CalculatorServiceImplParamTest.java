package skypro.calculator;


import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import skypro.calculator.CalculatorService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static skypro.calculator.TestConstants.*;

public class CalculatorServiceImplParamTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    @MethodSource("provideParams")
    @ParameterizedTest
    public void getSum(int num1, int num2) {
        assertEquals(num1 + num2, out.getSum(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    public void getMinus(int num1, int num2) {
        assertEquals(num1 - num2, out.getMinus(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    public void getMultiply(int num1, int num2) {
        assertEquals(num1 * num2, out.getMultiply(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    public void getDivide(int num1, int num2) {
        assertEquals(num1 / num2, out.getDivide(num1, num2));
    }

    private static @NotNull Stream<Arguments> provideParams() {
        return Stream.of(
                Arguments.of(NUMBER_ONE, NUMBER_TWO),
                Arguments.of(NUMBER_TWO, NUMBER_FOUR),
                Arguments.of(NUMBER_THREE, NUMBER_TWO),
                Arguments.of(NUMBER_FOUR, NUMBER_THREE),
                Arguments.of(NUMBER_ONE, NUMBER_TWO)
        );
    }
}
