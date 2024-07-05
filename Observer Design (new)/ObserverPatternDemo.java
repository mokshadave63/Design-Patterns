public class ObserverPatternDemo {
    public static void main(String[] args) {
        System.out.println("Moksha Dave 22BCP366");
        Account account = new Account("123456789", 1000);

        SMSObserver smsObserver = new SMSObserver();
        EmailObserver emailObserver = new EmailObserver();

        account.attach(smsObserver);
        account.attach(emailObserver);

        System.out.println("First state change: deposit 500");
        account.setBalance(account.getBalance() + 500);

        account.detach(smsObserver);

        System.out.println("Second state change: withdrawal 200");
        account.setBalance(account.getBalance() - 200);
    }
}
