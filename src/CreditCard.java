public class CreditCard {
    //instance variables:
    private String customer;            //name of the customer
    private String bank;                //name of the bank
    private String account;             //account identifier or account number
    private int limit;                  //credit limit (in francs)
    protected double balance;           //current balance (in francs)

    //Constructors:
    public CreditCard(String cus, String bk, String acc, int lim, double initialBal) {
        customer = cus;
        bank = bk;
        account = acc;
        limit = lim;
        balance = initialBal;
    }

    public CreditCard(String cus, String bk, String acc, int lim) {
        this(cus, bk, acc, lim, 0.0);      //initiated the balance to zero as default
    }

    //Accessor methods:
    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    //Update methods
    public boolean charge(double price) {             //make a charge
        if (price + balance > limit)                  //if charge would surpass the limit
            return false;                             //refuse the charge
        //At this point the charge is succesful
        balance += price;                             //updating the balance
        return true;
    }

    public void makePayment(double amount) {        //making a payment
        if (amount < 0){
            System.out.println("Error: your payment can't be negative!");
        }
        else
            balance -= amount;
    }

    public void setLimit(int val) {
        if (val < 0) {
            System.out.println("Error: your limit can't be negative!");
        }
        else
            limit = val;
    }

    //Utility method to print a card's information
    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);
        System.out.println("limit = " + card.limit);
    }
    public static void main(String[] args){
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("Neba Desmond", "NKWENCUL", "5391 0399 9387 5309",5000,0);
        wallet[1] = new CreditCard("Mofiro Jean", "BACCUL", "3485 0399 3395 1954",3500,0);
        wallet[2] = new CreditCard("John Bowman", "CAMCULL", "5391 0399 9387 5309",2500,300);

        for (int val = 1; val <=16; val++) {
            wallet[0].charge(3*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);
        }

        for (CreditCard card :wallet) {
            CreditCard.printSummary(card);
            if (card.getBalance() > 200.0){
                card.makePayment(-200);
                System.out.println("New balance = " + card.getBalance());
            }
        }
    }

}
