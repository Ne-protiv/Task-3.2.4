public class BankClient {
    String name;
    boolean heCanPay;
    boolean creditHistory;
    boolean problemWithLaw;

    BankClient(String name, boolean creditHistory, boolean problemWithLaw,boolean heCanPay) {
        this.name = name;
        this.creditHistory = creditHistory;
        this.problemWithLaw = problemWithLaw;
        this.heCanPay=heCanPay;
    }
}
