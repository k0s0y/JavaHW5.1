package ru.netology.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"'От 200 до 300',200,300, 3",
            "'От 100 до 500',100,500, 13",
            "'Минимальное раничное значения', 99, 101, 1",
            "'Максимальное граничное значения', 9800, 9802, 1",
            "'Максимальное количество корней', 99, 9802, 90",})

    void shouldSQRServiceTest(String name, int minLevel, int maxLevel, int expected) {
        SQRService service = new SQRService();


        // вызываем целевой метод:
        int actual = service.sqrtValueInRange(minLevel, maxLevel);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
