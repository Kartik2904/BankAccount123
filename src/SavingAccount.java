public class SavingAccount extends Account{

    private int interestRate;

    public SavingAccount(int accountNumber, String accountHolder, double balance, int intersetRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = intersetRate;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Interest Rate =  " + interestRate);
    }
}
