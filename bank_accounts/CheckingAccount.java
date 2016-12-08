class CheckingAccount extends Account
{
    CheckingAccount(String name, int amount) {
        super(name, amount);
    }

    void withdraw(int _amount) {
        this.setAmount(this.getAmount() - _amount);
        System.out.println("withdrew " + _amount + " pennies from Checking Account");
    }

    @Override
    void deposit(int _amount) {
        this.setAmount(this.getAmount() + _amount);
        System.out.println("deposited " + _amount + " pennies to Checking Account");
    }
}