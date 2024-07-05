public class SMSObserver implements Observer {
    @Override
    public void update(Account account) {
        System.out.println("SMS notification sent for account " + account.getAccountNumber() +
                ": Balance is now " + account.getBalance());
    }
}
