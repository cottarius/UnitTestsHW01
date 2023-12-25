import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {
        assert 900.0 == (int) Calculator.calculatingDiscount(1000, 10) : "Неправильный расчёт";
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(-1000, 10)
        ).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(1000, -10)
        ).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(1000, 1000)
        ).isInstanceOf(ArithmeticException.class);
    }
}

