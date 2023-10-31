package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PresenterTest {

    private final Calculator calculator = mock(Calculator.class);
    private final Presenter presenter = new Presenter(calculator);

    @Test
    void test() {
        when(calculator.sum( eq(5), eq(3))).thenReturn(8);

        presenter.showSum(5, 3);
        int actual = presenter.getRecentValue();

        assertEquals(8, actual);
    }
}