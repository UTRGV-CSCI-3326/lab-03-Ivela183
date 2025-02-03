public class BankAccount{
    public static void main(String[] arg){
        float balance = 2175.37F; //Starting balance
        balance -= 302.50;//Withdrew 302.50
        balance += 50.03;//Deposited 50.03
        balance /= 2;//Withdrew half of his balance
        balance += 20;//Deposited 20
        balance--;//Withdrew 1
        balance *= 2;//Deposited the same amount which double his amount
        balance++;//Depodited 1
        System.out.println(balance);// New Balance


    }
}
