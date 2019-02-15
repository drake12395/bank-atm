class Account{
  private int accountID;
  private double interest;
  private double balance;
  private final double intRate = 0.005;
  //construct account object
  Account(){
    balance = 0.0;
  }
  public int getAccountID(){
    accountID = 1000 + (int)(Math.random() * 9000);
    return accountID;
  }
  public void deposit(double moneyIn){  //adds deposit to balance
    balance += moneyIn;
  }
  public void withdraw( double moneyOut){  //subtracts withdraw from balance
    balance -= moneyOut;
  }
  public double getBalance(){
    return balance;
  }
  public void setInterest(double inInterest){  //sets interest based upon rate
    interest = inInterest * balance;
  }
  public double getInterest(){
    return interest;
  }
  public double getIntRate(){
    return intRate;
  }
  public double getCurrent(){
    return balance + interest;
  }

