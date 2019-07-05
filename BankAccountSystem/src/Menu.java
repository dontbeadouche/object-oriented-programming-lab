import java.util.*;
public class Menu {
	
	public static void main(String args[])
	{

	ArrayList<BankAccount> accountList = new ArrayList<>();
	int userchoice;
	boolean flag = false;
	Scanner scanner = new Scanner(System.in);
	do {
		
		System.out.println("Enter 1 to create new Account.");
		System.out.println("Enter 2 to access existing Account.");
		System.out.println("Enter 0 to quit.");
		
		
		{
			System.out.print("Enter your choice : ");
			userchoice=scanner.nextInt();
			
			switch(userchoice) {
			case 1:
				int accnum;
				double bal;
				String nm;
				String addr;
				BankAccount k=new BankAccount();
				
				
				System.out.println("Enter account number : ");
				accnum=scanner.nextInt();
				k.setAccno(accnum);
				
				System.out.println("Enter Name : ");
				nm=scanner.next();
				k.setName(nm);
				
				System.out.println("Enter Address : ");
				addr=scanner.next();
				k.setAddress(addr);
				
				System.out.println("Enter initial balance : ");
				bal=scanner.nextDouble();
				k.setBalance(bal);
				
				accountList.add(k);
				k.display(accnum,nm,addr,bal);
				
				
				
				break;
				
			
			case 2:
				System.out.println("Enter Account number : ");
				int i=scanner.nextInt();
				
				
				int flag1=1;
				for(BankAccount b:accountList )
				{
				
					if(b.getAccno()==i)
						{
							b.System();
							flag1=0;
						break;
						}
				}
				if(flag1==1)
				{ System.out.println("Account does not exist."); }
				
				break;
			case 0:
				flag= true;
				break;
			default:
				System.out.println("Invalid choice");
				break;
				
		}
		}
	}while(!flag);
	
	}
}