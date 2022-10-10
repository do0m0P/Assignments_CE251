class SavingAccount extends Pr1.Account{
    double overdraftLimit = 0;

    public SavingAccount(int Id, double newBalance) {
        super(Id, newBalance);
    }

    public void CheckOverdraw (double w) {
        if (getBalance() - w < overdraftLimit)
            System.out.println("Insufficient Funds");
        else
            setBalance(getBalance()-w);
    }
}


class CheckingAccount extends Pr1.Account {
    double overDraft = -1000;

    public CheckingAccount(int Id, double newBalance) {
        super(Id, newBalance);
    }

    public void CheckOverdraft(double i) {

        if (getBalance() - i < overDraft){
            System.out.println("Failure: Can't overdraft more than Rs1,000” + " +
                    "A Rs 25 overdraft fee will be issued to your account. ");
            setBalance(getBalance()-25);
        }
        else
            setBalance(getBalance()-i);
    }
}


public class pr5 {
    public static void main(String[] args) {
        SavingAccount Sacc = new SavingAccount(10,9000);
        CheckingAccount Cacc = new CheckingAccount(20, 30000);
        System.out.println("Savings Account: ");
        System.out.println(Sacc.getID());
        System.out.println(Sacc.getBalance());
        System.out.println(Sacc.getDateCreated());

        System.out.println("Checking Account: ");
        System.out.println(Cacc.getID());
        System.out.println(Cacc.getBalance());
        System.out.println(Cacc.getDateCreated());
    }
}
