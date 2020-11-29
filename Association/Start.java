import java.lang.*;
public class Start
{
	public static void main(String args[])
	{
		/*Account a1=new Account(07,"Regular",1000);
		Customer c1=new Customer();
		
		c1.setName("Marfy");
		c1.setNid(01144);
		c1.setAccount(a1);
		
		System.out.println("Customer Name : "+c1.getName());
		System.out.println("Customer NID : "+c1.getNid());
		System.out.println("Account Number : "+c1.getAccount().getAccountNumber());
		System.out.println("Account Holder Name : "+c1.getAccount().getAccountHolderName());
		System.out.println("Balance : "+c1.getAccount().getBalance());
		System.out.println();*/
		
		Account a2=new Account();
		Customer c2=new Customer();
		
		a2.setAccountNumber(400);
		a2.setAccountHolderName("Primum");
		a2.setBalance(5000);
		
		c2.setName("Nahid");
		c2.setNid(1939991);
		c2.setAccount(a2);
		
		System.out.println("Customer Name : "+c2.getName());
		System.out.println("Customer NID : "+c2.getNid());
		System.out.println("Account Number : "+c2.getAccount().getAccountNumber());
		System.out.println("Account Holder Name : "+c2.getAccount().getAccountHolderName());
		System.out.println("Balance : "+c2.getAccount().getBalance());
	}
}