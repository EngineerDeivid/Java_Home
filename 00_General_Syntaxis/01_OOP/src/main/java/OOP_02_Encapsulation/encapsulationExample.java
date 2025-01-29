    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
     */
    package OOP_02_Encapsulation;
    import java.util.Scanner;

    public class encapsulationExample {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int userOption;
            bankAccount bankAccount = new bankAccount("", 0.0f); /* "", 0.0f, 0.0f its for put on the class in zero and as well,
                                                                              for begin the class and pass that information in this main class.*/

            do {
                System.out.println("Welcome to the national bank of Colombia!:");
            System.out.println("Please enter an option.\n"
                    + "[1]. Login.\n"
                    + "[2]. Rewiew history of deposit and withdraw.\n"
                    + "[3]. Do a withdraw.\n"
                    + "[4]. Log out.\n");
            userOption = input.nextInt();

            switch (userOption) {
                case 1:
                    bankAccount.createAccount();
                    break;
                case 2:
                    bankAccount.reviewHistory();
                    break;
                case 3:
                    bankAccount.make_withDraw() ;
                    break;
                case 4:
                    System.out.println("Exiting the program, thanks for chooise us!.\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error, enter a validated option!.");
            }

            } while (userOption != 4);
        }   
    }
