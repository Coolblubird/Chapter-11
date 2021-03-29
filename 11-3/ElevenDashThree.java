import java.util.*;

//Jordan Ashe 03-19-21

class ElevenDashThree{
	//main
	public static void main(String[] args) {
		SavingAccount account1 = new SavingAccount(2,2000);
		CheckingAccount account2 = new CheckingAccount(1,1000);
		
		System.out.println(account1.toStringSA());
		
		System.out.println(account2.toStringCA());
	}		
}
	
//account class set
class Account{
	private int id;
	private double balance;
	private double air;
	private Date dateCreated = new Date();
	
	//self explanitory
	double getID() {
		return id;
	}
	
	//self explanitory
	void setID(int newID) {
		id = newID;
	}
	
	//self explanitory
	double getBalance() {
		return balance;
	}
	
	//self explanitory
	void setBalance(double newBalance) {
		balance = newBalance;
	}
		
	double getAIR(){
		return air;
	}
	
	void setAIR(double newAIR){
		air = newAIR;
	}
	
	Date getDateCreated(){
		return dateCreated;
	}
	
	double getMonthlyInterestRate(){
		return air / 100 / 12;
	}
	
	double getMonthlyInterest(){
		return balance * (air / 100 /12);
	}
	
	void withdraw(double amount){
		balance -= amount;
	}
	
	void deposit(double amount){
		balance += amount;
	}
}

class SavingAccount extends Account{
	boolean overdraw;
	
	SavingAccount(){
		setID(0);
		setBalance(0.0);
		setAIR(0.0);
		overdraw=false;
	}
	
	//if a new set is given for the constructor
	SavingAccount(int newID, double b) {
		setID(newID);
		setBalance(b);
		setAIR(0.0);
		overdraw=false;
	}
	
	boolean isOverdraw(){
		return overdraw;
	}
	
	String toStringSA(){
		return "This account has $" + this.getBalance() + ", and cannot overdraw";
	}
}

class CheckingAccount extends Account{
	private boolean overdraw;
	private double draftLimit;
	
	CheckingAccount(){
		setID(0);
		setBalance(0.0);
		setAIR(0.0);
		overdraw=true;
		draftLimit = 1000;
	}
	
	//if a new set is given for the constructor
	CheckingAccount(int newID, double b) {
		setID(newID);
		setBalance(b);
		setAIR(0.0);
		overdraw=true;
		draftLimit = 1000;
	}
	
	boolean isOverdraw(){
		return overdraw;
	}
	
	double getLimit(){
		return draftLimit;
	}
	
	String toStringCA(){
		return "This account has $" + this.getBalance() + ", and can overdraw with a limit of " + this.getLimit();
	}
}