import java.util.Scanner;


class BankDetails{


 String acc_number , acc_type, name;
 long balance=1000;

public void openAccount(){
 Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE ACCOUNT NUMBER :");
 acc_number = sc.next();
 System.out.println("ENTER TYPE OF : ");
 acc_type = sc.next();
 System.out.println("ENTER THE NAME OF ACCOUNT HOLDER :");
 name = sc.next();
 System.out.println("ENTER BALANCE AMOUNT :");
balance = sc.nextLong();

}
 public void display_acc_details(){
    System.out.println("ACCOUNT NUMBER :"+acc_number  +"/n" +"TYPE OF ACCOUNT :"+acc_type +"/n" +"NAME OF ACCOUNT HOLDER :" +"/n" +"ACCOUNT BALANCE :"+balance );


}
public void deposit(){
    System.out.println("ENTER THE AMMOUNT TO DEPOSITE  :");
    long amt= sc.nextLong();
    balance=balance+amt;

}
public void withdraw(){
    System.out.println("ENTER THE AMMOUNT TO  WITHDRAW  :");
    long amt=sc.nextLong();
    if(amt>=amt){
        balance=balance-amt;
        System.out.println("BALNCE AFTER WITHDRAW  :"+balance);

    }
    else{
        System.out.println("THE BALANCE IN YOUR IS LESS THEN  :"+amt  +"/t"+"INSUFFICENT BALANCE");
    }
/**
 * @param ac_num
 * @return
 */
public boolean search(String ac_num){

    if(acc_number == ac_no){
        System.out.println(display_acc_details());
        return(true);
    }

     return(false);



    
}

}
 


public class mybank {

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
    
        System.out.println("ENTER NUMBER OF DATA YOU WANT TO ENTER");
        int a=sc.nextInt();


        BankDetails C[] = new BankDetails[a];
        for(int i =0; i<C.length;i++){
            C[i]=new BankDetails();
            C[i].openAccount();
            
        }
        int ch;  
        do {  
            System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < C.length; i++) {  
                            C[i].display_acc_details(); 
                        }  
                        break;  
                    case 2:  
                        System.out.print("Enter account no. you want to search: ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("Enter Account no. : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("Enter Account No : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].withdraw();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 5:  
                        System.out.println("See you soon...");  
                        break;  
                }  
            }  
            while (ch != 5);  
        }  
    }  
      
    
