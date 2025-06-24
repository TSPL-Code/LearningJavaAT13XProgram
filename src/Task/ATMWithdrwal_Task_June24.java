package Task;

import java.util.Scanner;

public class ATMWithdrwal_Task_June24 {
    public static void main(String[] args) {
        //Steps to Write the Program
//        1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
//        2️⃣ Take user input for the amount they want to withdraw.
//        3️⃣ Check withdrawal conditions:
//        The amount should be greater than zero.
//                The amount should be a multiple of 100 (common ATM rule).
//        The amount should not exceed the account balance.
//        4️⃣Deduct the amount from the balance if conditions are met.
//        5️⃣Display the updated balance or an error message if the withdrawal fails.
         int avaliablebalance=10000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter amount requested to withdrawal");
        int withdrwalamount=scanner.nextInt();
        if(withdrwalamount<0)
        {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
      else if (withdrwalamount %100==0)
      {
          if(withdrwalamount<avaliablebalance)
          {
              int updatedavaliablebalance;
              updatedavaliablebalance=avaliablebalance-withdrwalamount;
              System.out.println("Collect cash or Withdrwal amount:"+ withdrwalamount);
              System.out.println("Current avaliable Balance:" +updatedavaliablebalance);
          } else if (withdrwalamount==avaliablebalance)
          {
              System.out.println("Withdrwalamount should not be same as Current avaliable balance , should maintain minimum balance 1000");

          }
          else if (withdrwalamount>avaliablebalance)
          {
              System.out.println("Withdrwalamount more than Current avaliable balance");
              System.out.println("The amount should not exceed the account balance");
          }
      }
      else {
          System.out.println("The amount should be a multiple of 100");

      }
    }
}
