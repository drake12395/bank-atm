
import java.util.Scanner;

public class Prog8{
  public static void main (String [] args){
    Account a1 = new Account(); // create a new Account object
    Scanner input = new Scanner(System.in);
    double dep = 0;
    double wDraw = 0;
    String cursor = "dwip";
    //within while loop, use a series of if statements to distinguish between d$
    String userInput;
    int accountID = a1.getAccountID();
    while(input.hasNext()){
      //read in cursor string and use to call for action that follows each lett$
      for(int i = 0; i < cursor.length(); i++){
        cursor = input.next();
        if (cursor.charAt(i) == 'd'){
          dep = input.nextDouble();
          a1.deposit(dep);  // sends deposit to Account class to record a depos$
          System.out.printf("$%.2f deposited into account " + accountID + "\n" $
        }

        if (cursor.charAt(i) == 'w') {
          wDraw = input.nextDouble();
          if((a1.getBalance() + a1.getInterest())  < wDraw) {
            System.out.printf("Error: cannot withdraw $%.2f\n", wDraw);
          }
          else{
            a1.withdraw(wDraw); // sends withdraw to Account class to record a $
            System.out.printf("$%.2f withdrawn from account " + accountID + "\n$
          }
        }
        if(cursor.charAt(i) == 'i'){
          a1.setInterest(a1.getIntRate()); // uses interest rate method to set $
          System.out.printf("$%.2f interest added to account " + accountID + "\$
        }
        if(cursor.charAt(i) == 'p'){
          System.out.printf("Current balance for account " + accountID + ": $%.$
        }
      }
    }
  }
}

