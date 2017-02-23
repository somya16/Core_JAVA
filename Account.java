package oopsbasic;
class Accountholderdetails{
	int accountbal;
	String accountHolderName;
	float amount;
	
	void bank(int accountbal, String accountHolderName, float amount){
		this.accountbal=accountbal;
		this.accountHolderName=accountHolderName;
		this.amount=amount;
	}
	
	void withdraw(float amnt){
		if(accountbal<amnt){
			System.out.println("In sufficient balance :"+accountbal);
		}
		else{
		accountbal-=amnt;
		System.out.println("withdrawal Amount: "+accountbal);
	}
}
	
	void deposit(float amnt){
		accountbal+=amnt;
		System.out.println("Deposit Amount: "+accountbal );
	}
	
	void checkbalance(){
		System.out.println("Balance account :"+accountbal);
	}
	void display(){
		System.out.println(accountHolderName +"  "+ accountbal +"  "+ amount);
	}
}

public class Account {
public static void main(String[] args) {
	Accountholderdetails a1=new Accountholderdetails();
	a1.bank(100, "Somya", 0);
	a1.display();
	a1.withdraw(10);
	a1.deposit(30);
	a1.checkbalance();
}
}
