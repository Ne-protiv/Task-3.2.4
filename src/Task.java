public class Task {
    public static void main(String[] args) {
        BankWorker bankWorker = new BankWorker("Oleg");
        BankClient bankClient = new BankClient("Ilia", true, false, true);
        boolean result = getCreditForClient (bankWorker,bankClient);
        System.out.println(result);

    }
    public static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient){
        try {
            return bankWorker.checkClientForCredit(bankClient);

        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");
            return false;

        } catch (ProblemWithLawException e) {
            return false;
        }
    }
}


