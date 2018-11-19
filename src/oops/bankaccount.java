package oops;

public class bankaccount {
//define variables
	String accountnumber;
	String routingnumber;
	//Instance variables
	String name;
	String ssn;
	String accounttype;
	String balance;
	
	//constructors definitions:unique methods
	  //1. used to define/intialize/setup properties of an object
	  //2.Constructors are IMPLICITLY called upon instantiation
	  //3.The same name as class itself
	bankaccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	//Overloading: call same method name with different arguments
	bankaccount(String accounttype){
		System.out.println("new account: " +accounttype);
	}
	//accounttype, double initDeposit are all local variables
	
	bankaccount(String accounttype,double initDeposit){
		System.out.println("new account: " +accounttype);
		System.out.println("initial deposit of:$ " +initDeposit);
		if (initDeposit <1000) {
		    String Msg = "Error:Minimum deposit must be atleast $1000";
		}else {
			String Msg ="Thanks for your initial deposit of: $" +initDeposit;
			
		}
	
	 }
	
	//define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("deposit");	
   }
	
	public void withdraw(double amount) {
		balance = balance + amount;
		showActivity("withdraw");
   }
	
	private void showActivity(String Activity) {
		System.out.println("RECENT TRANSACTION: " +Activity);
		System.out.println("NEW BALANCE:$" +balance);
	}
	
	//private: can only be called from within the class
	void checkbalance() {
		
   }
	void getstatus() {
		
   }
	//overide
	public String toString( ) {
		return"["+ name +"."+ accountnumber +".balance: $" + balance +"]";
	}
}
