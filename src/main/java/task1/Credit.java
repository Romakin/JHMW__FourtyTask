package task1;

public class Credit {

    private final double loanRate;
    private final int months;
    private final int amount;

    public Credit(double loanRate, int months, int amount) {
        this.loanRate = loanRate;
        this.months = months;
        this.amount = amount;
    }

    public int getMonthlyPayment() {
        double monthLoanRate = loanRate * 0.01 / 12;
        double anuitentRate = (monthLoanRate * Math.pow(1 + monthLoanRate, months)) /
                (Math.pow(1 + monthLoanRate, months) - 1);
        return (int) Math.round(anuitentRate * amount);
    }

    public int getTotalCreditSum() {
        return getMonthlyPayment() * months;
    }

    public int getTotalOverPayment() {
        return getTotalCreditSum() - amount;
    }

    @Override
    public String toString() {
        return "Ставка: " + loanRate +
                ", Срок: " + months +
                ", Сумма: " + amount;
    }
}
