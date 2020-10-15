package task1;

public class Credit {

    private float loanRate;
    private int months;
    private int amount;

    public Credit(float loanRate, int months, int amount) {
        this.loanRate = loanRate;
        this.months = months;
        this.amount = amount;
    }

    public int getMonthlyPayment() {
        return 0;
    }

    public int getTotalCreditSum() {
        return 0;
    }

    public int getTotalOverPayment() {
        return 0;
    }
}
