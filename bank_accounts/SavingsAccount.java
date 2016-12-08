class SavingsAccount extends Account
{
    SavingsAccount(String name, int amount) {
        super(name, amount);
    }

    @Override
    void deposit(int _amount) {
        super.deposit(_amount);
        System.out.println("deposited " + _amount + " pennies to Checking Account");
    }
}