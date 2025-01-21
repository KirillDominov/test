package skypro.calculator.service;

import org.junit.jupiter.api.Test;
import skypro.calculator.exception.ZeroDivideException;
import skypro.calculator.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.*;
import static skypro.calculator.constants.TestConstants.*;

class CalculatorServiceImplTest {

    private final CalculatorService out = new CalculatorServiceImpl();


    @Test
    public void getSum() {
        assertEquals(NUMBER_ONE + NUMBER_TWO, out.getSum(NUMBER_ONE, NUMBER_TWO));
        assertEquals(NUMBER_TWO + NUMBER_TWO, out.getSum(NUMBER_TWO, NUMBER_TWO));
    }

    @Test
    public void getMinus() {
        assertEquals(NUMBER_THREE - NUMBER_TWO, out.getMinus(NUMBER_THREE, NUMBER_TWO));
        assertEquals(NUMBER_FOUR - NUMBER_TWO, out.getMinus(NUMBER_FOUR, NUMBER_TWO));
    }

    @Test
    public void getMultiply() {
        assertEquals(NUMBER_THREE * NUMBER_ONE, out.getMultiply(NUMBER_THREE, NUMBER_ONE));
        assertEquals(NUMBER_TWO * NUMBER_TWO, out.getMultiply(NUMBER_TWO, NUMBER_TWO));
    }

    @Test
    public void getDivide() {
        assertEquals(NUMBER_THREE / NUMBER_FOUR, out.getDivide(NUMBER_THREE, NUMBER_FOUR));
        assertEquals(NUMBER_THREE / NUMBER_THREE, out.getDivide(NUMBER_THREE, NUMBER_THREE));
    }

    @Test
    public void shouldThrowExceptionIfDividerIsNull() {
        assertThrows(ZeroDivideException.class, () -> out.getDivide(NUMBER_ONE, NULL_NUMBER));
    }

}
