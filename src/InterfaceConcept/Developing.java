package InterfaceConcept;

public class Developing implements BankingClient, DomainClient {
	// now this class is responsible to implements ALL the methods.
	// public can access outside the class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developing client1 = new Developing();
		client1.payCreditCard();
		client1.loggedIn();

		BankingClient client2 = new BankingClient() {
			@Override
			public void transferBalance() {
				// TODO Auto-generated method stub
			}
			@Override
			public void payCreditCard() {
				// TODO Auto-generated method stub
			}
			@Override
			public void checkBalance() {
				// TODO Auto-generated method stub
			}
		};
		
		client2.transferBalance();
		client2.payCreditCard();
		client2.checkBalance();
		// Can't use loggedIn methods cause its not declared in the interface.
		//client only interested in methods defined in Interface.
		// d2.loggedIn();
		client1.loggedIn();
		
	}

	@Override
	public void payCreditCard() {
		// TODO Auto-generated method stub
		System.out.println("payCreditCard implemented");
	}

	@Override
	public void transferBalance() {
		// TODO Auto-generated method stub
		System.out.println("transferBalance implemented");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("checkBalance implemented");
	}

	// Another class which is not presented in the banking class interface!
	public void loggedIn() {
		System.out.println("loggedIn");
	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub
		System.out.println("Investing somethig");
		
	}
	
	DomainClient DC = new DomainClient() {
		
		@Override
		public void investment() {
			// TODO Auto-generated method stub
			
		}
	};
	
	
	
	
	
}
