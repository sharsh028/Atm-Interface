import java.util.*;

class BankAccount{
    static void register(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.print("Enter your Name : ");
        ATM.name = sc.nextLine();
        System.out.print("Enter your Username : ");
        String user = sc.nextLine();
        System.out.print("Enter your Password : ");
        String pass = sc.nextLine();
        System.out.print("Enter your Account Number : ");
        ATM.accnumber = sc.nextLine();
        System.out.println("REGISTRATION SUCCESSFULL!");
        System.out.println("---------------------------");
        ATM.prompt();
        sc.close();
    }
}

class Transaction{
    static void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit : ");
        int dcash = sc.nextInt();
        ATM.updatebalance(dcash);
        ATM.history.add(Integer.toString(dcash));
        ATM.history.add("Deposit");
        System.out.println("Amount Rs "+dcash+"/- deposited successfully.");
        System.out.println("---------------------------");
        ATM.prompt();
        sc.close();
    }
    static void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw : ");
        int wcash = sc.nextInt();
        if(wcash<=ATM.balance){
            ATM.balance = ATM.balance - wcash;
            ATM.history.add(Integer.toString(wcash));
            ATM.history.add("Withdraw");
            System.out.println("Amount Rs "+wcash+"/- withdrawed successfully.");
            System.out.println("---------------------------");
        }
        else{
            System.out.println("Insufficient funds to withdraw.");
            System.out.println("---------------------------");
        }
        ATM.prompt();
        sc.close();
    }
    static void transfer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter receiver's name :");
        String rname = sc.nextLine();
        System.out.print("Enter receiver's account number :");
        String raccnumber = sc.nextLine();
        System.out.print("Enter amount to be transferred :");
        int tcash = sc.nextInt();
        if(tcash<=ATM.balance){
            ATM.balance = ATM.balance - tcash;
            ATM.history.add(Integer.toString(tcash));
            ATM.history.add("Transfer");
            System.out.println("Amount Rs"+tcash+"/- transferred successfully.");
            System.out.println("---------------------------");
        }   
        else{
            System.out.println("Insufficient funds to transfer.");
            System.out.println("---------------------------");
        }
        ATM.prompt();
        sc.close(); 
    }
}

class Check{
    static void checkbalance(){
        System.out.println("---------------------------");
        System.out.print("The available balance in the bank account : ");
        ATM.showbalance();
        System.out.println("---------------------------");
        ATM.prompt();
    }
}

class His{
    static void transactionhistory(){
        System.out.println("---------------------------");
        System.out.println("Transaction History ");
        int k = 0;
        if(ATM.balance>0){
            for(int i = 0;i<(ATM.history.size()/2);i++){
                for(int j = 0; j<2;j++){
                    System.out.print(ATM.history.get(k)+" ");
                    k++;
                }
                System.out.println("");
                System.out.println("---------------------------");
            }
        }
        else{
            System.out.println("Your account is empty.");
        }
        ATM.prompt();
    }
}

class ATM{
    public static String name;
    public static int balance=0;
    public static String accnumber;
    public static ArrayList<String> history=new ArrayList<String>();

    static void updatebalance(int cash){
        balance = balance + cash;
    }
    static void showbalance(){
        System.out.println(balance);
    }

    public static void homepage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Interface!!");
        System.out.println("----------------------------");
        System.out.println("Select an Option");
        System.out.println("1. Register");
        System.out.println("2. Exit");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        if(choice==1){
            BankAccount.register();
        }
        else{
            if(choice==2){
                System.exit(0);
            }
            else{
                System.out.println("Select value from the given options.");
                homepage();
            }
        }
        sc.close();
    }

    public static void prompt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME "+ ATM.name + " TO ATM SYSTEM");
        System.out.println("---------------------------");
        System.out.println("Select an option");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer");
        System.out.println("4. Check Balance");
        System.out.println("5. Transaction History");
        System.out.println("6. Exit");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Transaction.deposit();
                break;
        
            case 2:
                Transaction.withdraw();
                break;
            case 3:
                Transaction.transfer();
                break;
            case 4:
                Check.checkbalance();
                break;
            case 5:
                His.transactionhistory();
                break;
            case 6:
                System.exit(0);
                break;
        }
        sc.close();
    }

    public static void main(String[] args){
        homepage();
    }
}