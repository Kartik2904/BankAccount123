public class Main {
    public static void main(String[] args) {
/*

        Account one = new SavingAccount(1234,"kartik",7000.00,3);
        one.getInfo();

        one.withdraw(2000);
        one.getInfo();

        one.withdraw(6000);
        one.getInfo();

        one.deposit(0);

        Account check = new CheckingAccount(5667,"Nothing",3000,1000);
        check.getInfo();

        check.withdraw(4000);
        check.getInfo();

        check.withdraw(4000);
        check.getInfo();

        check.setBalance(900);
        check.getInfo();

        Account [] accounts = new Account[3];
        accounts[0] = new SavingAccount(123,"Kartik",9000,3);
        accounts[1] = new CheckingAccount(5667,"Rushi",9000,3000);
        accounts[2] = new Account(89889,"Ramesh",15000);
        Main1.processAccounts(accounts);

        accounts[0].getInfo();
        accounts[1].getInfo();

        accounts[0].withdraw(10000);
        accounts[0].getInfo();

        accounts[0].withdraw(3000);
        System.out.println(accounts[0].getBalance());

        System.out.println("------------------------------");
        Account thing = new CheckingAccount(34534,"rtert",1000,2000);
        thing.withdraw(1000);
        thing.getInfo();
        //thing.withdraw(3000);
        //thing.getInfo();


*/
        Account [] a = new Account [3];
        a[0] = new SavingAccount(5667,"JJ",1000,6);
        a[1] = new SavingAccount(3532,"yy",13000,5);
        a[2] = new CheckingAccount(67545,"vv",15000,3);

        Main1.processAccounts(a);

        a[0].getInfo();
        System.out.println("---------------------------------------");

        a[1].withdraw(100);
        a[1].getInfo();
        a[2].withdraw(100);
        a[2].getInfo();


    }
}