/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_02_Encapsulation;
import java.util.ArrayList;
import java.util.Scanner;

public class bankAccount {
    private String nameRightParty;
    private float Balance;
    private ArrayList<Float> withdrew;
    private ArrayList<Float> deposit;
    
    public bankAccount (String nameRightParty, float Balance){
        
        this.nameRightParty = nameRightParty;
        this.Balance = Balance;
        this.deposit = new ArrayList<>(); //to store deposit amounts
        this.withdrew = new ArrayList<>(); // to store deposit withdrew
    }
    
    public void get_Info() {
        System.out.println("hello "+this.nameRightParty+", \n your current balance is $"+this.Balance);
    }
    
    public void makeDeposit () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit:\n");
        float UserDeposit = input.nextFloat();
        if (UserDeposit <= 0) {
            System.out.println("Error, enter a valitated amount!.");
        } else {
            this.Balance =+ UserDeposit;
            this.deposit.add(UserDeposit);
            System.out.println("Gratulations, you have deposited"+UserDeposit);
        }
    }
    // option 1 from menu
    public void createAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name.\n");
        this.nameRightParty = input.nextLine();
        makeDeposit(); 
    }
    
    // option 2 from menu 
    
    public void reviewHistory() {
        System.out.println("\nThis is the history for all deposits mades.");
        this.deposit.forEach(eachDeposit -> {
            System.out.println("$"+eachDeposit);
        });
        
        System.out.println("\nThis is the history for all withdrew mades.");
        this.withdrew.forEach(eachwithdrew -> {
            System.out.println("$"+eachwithdrew);
        });
    }
    
    // option 3 form menu
    public void make_withDraw() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amout you want to withdraw: ");
        float userWithdraw = input.nextFloat();
        if (userWithdraw > this.Balance) {
            System.out.println("In this moment you can not to make a withdraw, because you have insufficient founds.");
            make_withDraw();
            
        } else {
            
            this.Balance -= userWithdraw;
            this.withdrew.add(userWithdraw);
            System.out.println("Gratulations, you have Withdred of "+userWithdraw+" and your outstanding balance is $"+ this.Balance);
        }
    }
}
