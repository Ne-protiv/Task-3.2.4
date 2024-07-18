public class BankWorker {
    String name;

    BankWorker(String name) {
        this.name = name;
    }

    public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
        if (!bankClient.creditHistory) {
            throw new BadCreditHistoryException("");
        }
        if (!bankClient.problemWithLaw) {
            throw new ProblemWithLawException("");
        }
        return (bankClient.creditHistory & bankClient.problemWithLaw & bankClient.heCanPay);
    }
}


