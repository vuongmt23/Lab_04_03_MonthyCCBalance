public class Main {
    public static void main(String[] args) {
        double initialBalance = 5000.0;
        double monthlyInterestRate = 0.17;

        double balanceAfterOneMonth = initialBalance + (initialBalance * monthlyInterestRate);
        double balanceAfterTwoMonths = balanceAfterOneMonth + (balanceAfterOneMonth * monthlyInterestRate);

        System.out.println("Initial credit card balance: $" + initialBalance);
        System.out.println("Balance after one month with 17% interest: $" + balanceAfterOneMonth);
        System.out.println("Balance after two months with 17% interest: $" + balanceAfterTwoMonths);
    }
}
