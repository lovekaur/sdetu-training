package oops;

public class bankaccountapp {
	public static void main(String[] args) {
		//creating a bank account >>think instantiate an object
		
		bankaccount acc1= new bankaccount();
		acc1.accountnumber = "123455";
		acc1.name = "ronny";
        
		acc1.deposit(1000);
		acc1.deposit(1000);
		acc1.deposit(1000);
		acc1.withdraw(2000);
		
		
		
		//system.out.println(acc1.toString());
		
		
		
		bankaccount acc2= new bankaccount("chequing account");
		
		bankaccount acc3= new bankaccount("saving account",5000);
		
		
	}

}
