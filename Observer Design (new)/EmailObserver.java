public class EmailObserver implements Observer {
    @Override
    public void update(Account account) {
        System.out.println("Email notification sent for account " + account.getAccountNumber() +
                ": Balance is now " + account.getBalance());
    }
}
