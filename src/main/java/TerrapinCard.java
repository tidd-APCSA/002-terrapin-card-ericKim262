public class TerrapinCard {
  private double balance;


  public TerrapinCard(double balance){
    this.balance = balance;
  }

  public void payEconomical(){
    if(balance >= 2.5){
      balance -= 2.5;
    }else if(balance < 2.5){
      balance = balance;
    }
  }

  public void payGourmet(){
    if(balance >= 4.0){
      balance -= 4.0;
    }else if(balance < 4.0){
      balance = balance;
    }
  }

  public void loadMoney(double amount){
    if(amount < 0){
      balance = balance;
    }else if(amount > 150){
      balance += 150;
    }else{
      balance += amount;
    }
  }

  public double getBalance(){
    return this.balance;
  }

  public String toString(){
    return "The card has " + this.balance + " dollars";
  }


















}
