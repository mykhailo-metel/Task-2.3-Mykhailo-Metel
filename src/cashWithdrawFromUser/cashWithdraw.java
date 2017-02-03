package cashWithdrawFromUser;

/**
 * Created by Mykhailo Metel on 03.02.2017.
 *
 You need to write method which withdraw money of particular account owner if he/she can.
 Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal in other case.
 Comision is 5% for all cases.

 Example

 Input

 int[] balances = {1200, 250, 2000, 500, 3200};
 String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

 String ownerName = Ann
 double withdrawal = 100;

 Output
 Ann 100 145

 Input

 int[] balances = {1200, 250, 2000, 500, 3200};
 String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

 String ownerName = Oww
 double withdrawal = 490;

 Output
 Oww NO
 *
 */
public class cashWithdraw {

    public static void main(String[] args) {
        double[] balances = {15, 250, 2000, 500, 3200};
        String[] ownerNames = {"Vasia", "Ann", "Petia", "Oww", "Lane"};

        String ownerName="Vasia";
        double amount=490;
        withdrawMoney(ownerName, amount, balances, ownerNames);

       ownerName="Petia";
       amount=1000;
        withdrawMoney(ownerName, amount, balances, ownerNames);

        printBalances(ownerNames,balances);

    }

    private static void printBalances(String[] ownerNames, double[] balances) {
        for (int i = 0; i < ownerNames.length; i++)
            System.out.println("Name: " + ownerNames[i] + " Balance: " + balances[i]);
    }

    private static void withdrawMoney(String Name, double amountOfWithdraw, double[] balancesOnAccounts, String[] Names) {
        System.out.println(Name + " want to withdraw "+ amountOfWithdraw);

        for (int i = 0; i < Names.length; i++) {
            if(Names[i]== Name)
            {
                if(balancesOnAccounts[i] -1.05* amountOfWithdraw >=0){
                    balancesOnAccounts[i]-=1.05* amountOfWithdraw;
                    System.out.println("Operation successful");

                }else System.out.println("Insufficient funds!");
                System.out.println(Name+"'s balance after transaction is " + balancesOnAccounts[i]);
                break;
            }
        }
    }


}
