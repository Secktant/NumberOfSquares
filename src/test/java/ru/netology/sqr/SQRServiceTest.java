package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"'borderIsTenToTwn', 10, 299, 8",
            " 'borderIsZtoTen', 0, 10, 0"})
    void shouldCalculate(String testName, int lowerBound, int upBound, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculate(lowerBound, upBound);
        assertEquals(expected, actual);
    }
}