package accessModifier;


public class BankOfAmerica {
	
	private float CheckingBalance;
	public float getCheckingBalance() {
		return CheckingBalance;
	}


	public void setCheckingBalance(float checkingBalance) {
		CheckingBalance = checkingBalance;
	}


	private float SavingBalance;


	//Private methods and variables 
	//only access inside its own class 
	//no access outside of the class.
	//creating getter and setter method clicking source - generate getter and setter
	//will give access to the other class.
	
	private void CheckingBalance () {
		if (CheckingBalance<=2000) {
			System.out.println("You do not have enough ballance");
			
			
		}
		
		
	}
	

}
