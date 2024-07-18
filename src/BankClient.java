public class BankClient {
    protected String name;
    protected boolean heCanPay;
    protected boolean creditHistory;
    protected boolean problemWithLaw;

    BankClient(String name, boolean creditHistory, boolean problemWithLaw,boolean heCanPay) {
        this.name = name;
        this.creditHistory = creditHistory;
        this.problemWithLaw = problemWithLaw;
        this.heCanPay=heCanPay;
    }
}
