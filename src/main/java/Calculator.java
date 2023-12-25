public class Calculator {
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) throws ArithmeticException {
        if (purchaseAmount <= 0) {
            throw new ArithmeticException("Отрицательная цена");
        }
        if (discountAmount < 0) {
            throw new ArithmeticException("Отрицательная скидка");
        } else if (discountAmount > 100) {
            throw new ArithmeticException("Скидка больше 100%");
        }
        return purchaseAmount / 100 * (100 - discountAmount);
    }

}
