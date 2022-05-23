package week4.day1;

public class Bank extends SBI implements Cibil,PNB {

	public void creditScore() {
		System.out.println("120-220");
		// TODO Auto-generated method stub
		
	}

	public void minimumBalance() {
		System.out.println("4000");
		// TODO Auto-generated method stub
		
	}

	public void cibilScore() {
		System.out.println("200000");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bankBalance() {
		System.out.println("10000");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maximumLoanAmount() {
		System.out.println("200000");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		//bank extends of object
		Bank value=new Bank();
		value.SBIITLoan();
		value.bankBalance();
		value.maximumLoanAmount();
		
		
		//CIBIL implement of object
		Cibil value1=new Bank();
		value1.cibilScore();
		
		
		//PNB implement of object
		PNB value2=new Bank();
		value2.maximumLoanAmount();
		value2.creditScore();
		value2.minimumBalance();
	}

	
	 
}
