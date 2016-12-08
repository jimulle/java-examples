class Account
{
    Account(String name, int amount) {
        setName(name);
        setAmount(amount);
    }
    private String name;
    private int amount;
    String getName() {
        return this.name;
    }
    void setName(String _name) {
        this.name = _name;
    }
    int getAmount() {
        return this.amount;
    }
    void setAmount(int _amount) {
        this.amount = _amount;
    }
    void deposit(int _amount) {
        this.setAmount(this.getAmount() + _amount);
        System.out.println("deposited " + _amount + " pennies to Account");
    }
}