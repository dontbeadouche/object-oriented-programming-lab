import java.util.Scanner;
public class BankAccount {
	private int accno;
	private String name;
	private String address;
	private double balance;
	Scanner scan = new Scanner(System .in);
	
			public int getAccno() {
				return accno;
			}
			public void setAccno(int accno) {
				this.accno = accno;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public double getBalance() {
				return balance;
			}
			public void setBalance(double balance) {
				this.balance = balance;
			}
		
			
		public void display(int accno ,String name,String address,double balance)
			{ 
			System.out.println("Account number : "+accno);
			System.out.println("Name : "+name);
			System.out.println("Address : "+address);
			System.out.println("Balance : "+balance);
		
			}
		
		
		public void deposit()
			{
			double amount;
			
			
			System.out.println("Enter amount to deposit : ");
			amount = scan.nextDouble();
			
			if(amount<=0)
				System.out.println("Invalid amount !");
			else
				this.setBalance(this.getBalance()+amount);
			}
		
		
		public void withdraw()
		{
		 double amount;
		 
		 System.out.println("Enter amount to withdraw : ");
		 amount= scan.nextDouble();
		 
		 if(amount <=0 || amount> (balance-100))
			 System.out.println("Withdraw can't be completed.");
		 else
			 this.setBalance(this.getBalance()-amount);
		 	 System.out.println(+amount +" has been withdrawn.");
		 }
		
		public void System()
		{
			int choice;
			boolean quit = false;
			
			
			
			do {
				System.out.println("Enter 1 for Deposit.");
				System.out.println("Enter 2 for Withdrawal.");
				System.out.println("Enter 3 for Checking balance/Display details.");
				System.out.println("Enter 0 to quit.");
				choice=scan.nextInt();
				
				switch(choice) {
				
				case 1:
					this.deposit();
					break;
				case 2:
					this.withdraw();
					break;
				case 3:
					this.display(this.getAccno(),this.getName(),this.getAddress(),this.getBalance());
					break;
				case 0:
					quit=true;
					break;
					
				}
				
				}while(!quit);
		}
	}
