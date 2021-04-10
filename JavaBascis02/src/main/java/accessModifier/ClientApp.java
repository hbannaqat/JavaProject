package accessModifier;

public class ClientApp {

	public static void main(String[] args) {
		
		
		BankOfAmerica boa = new BankOfAmerica();
		boa.setCheckingBalance(3000);
		
		ChaseBank cb = new ChaseBank();
		cb.checkingBalance=2000;
		cb.savingBalance=3000;
		cb.totalBalance();
		
		WellsFargoBank wb = new WellsFargoBank();
		wb.checkignbalance=2000;
		wb.savingbalance=2000;
		wb.totalBalance();
	}

}
