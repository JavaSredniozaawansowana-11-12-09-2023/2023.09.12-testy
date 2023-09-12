package pl.comarch.szkolenia.testy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 7;
        int expected = 12;

        int actual = calculator.add(a, b);

        //Assertions.assertEquals(expected, actual);
        if(expected != actual) {
            Assertions.fail();
        }
    }
}
