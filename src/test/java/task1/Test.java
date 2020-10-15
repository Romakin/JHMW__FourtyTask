package task1;

import org.junit.jupiter.api.Assertions;

public class Test {

    @org.junit.jupiter.api.Test
    public void testMonthlyPayment() {
        Credit test = new Credit(7.5, 24, 3_000_000);
        int payment = 134_999;

        Assertions.assertEquals(payment, test.getMonthlyPayment());
    }

    @org.junit.jupiter.api.Test
    public void testTotalCreditSum() {
        Credit test = new Credit(7.5, 24, 3_000_000);
        int totalSum = 3_239_976;

        Assertions.assertEquals(test.getTotalCreditSum(), totalSum);
    }

    @org.junit.jupiter.api.Test
    public void testTotalOverPayment() {
        Credit test = new Credit(7.5, 24, 3_000_000);
        int totalOverPay = 239_976;

        Assertions.assertEquals(test.getTotalOverPayment(), totalOverPay);
    }
}
