import java.lang.*;

public class Customer
{
    private String name;
	private int nid;
	private Account account;
	
	public void setName(String name)
	{
	this.name=name;
	}
		public void setNid(int nid)
		
	{
	this.nid=nid;
	}
		public void setAccount(Account account)
	{
	this.account=account;
	}
	
	public String getName(){return name;}
	public int getNid(){return nid;}
	public Account getAccount(){return account;}
}