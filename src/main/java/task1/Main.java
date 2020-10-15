package task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Расчитаем кредит (для выхода /end)");

            System.out.println("Сумма кредита");
            String line = scanner.nextLine();
            if(line.equals("end")) break;
            int amount = Integer.parseInt(line);

            System.out.println("Срок в месяцах");
            line = scanner.nextLine();
            int months = Integer.parseInt(line);

            System.out.println("Ставку в процентах");
            line = scanner.nextLine();
            double loanRate = Double.parseDouble(line);

            Credit credit = new Credit(loanRate, months, amount);
            System.out.println(credit);

            System.out.println("Ежемесячный платеж: " + credit.getMonthlyPayment());
            System.out.println("Переплата по кредиту: " + credit.getTotalOverPayment());
            System.out.println("Общая выплата: " + credit.getTotalCreditSum());
        }
    }
}
