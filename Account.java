	public class Account
	{
			protected String name;
			protected String Id;
			protected String address;
			protected String bookname;
			

	public Account()
	{
		this.name=" ";
		this.Id=" ";
		this.address=" ";
		this.bookname=" ";

	}
	public Account(String name ,String Id,String address,String bookname)
	{
			this.name=name;
			this.Id=Id;
			this.address=address;
			this.bookname=bookname;
	}
	protected boolean deposit()
	{
		
		if(this.name=="Sharnya")
		{
		
			return false;
		}
		else
		{
			return true;
		}
	}

	
	
	public void printAccount()

	{


		System.out.println("Name is: "+this.name);
		System.out.println("ID is: "+this.Id);
		System.out.println("Address is: "+this.address);
		System.out.println("Bookname is: "+this.bookname);




	}


	public void setName(String name)


	{
		this.name=name;
	}


	public String getName()


	{
		return this.name;
	}


	public void setID(String Id)


	{
		this.Id=Id;
	}


	public String getID()


	{
		return this.Id;
	}


	public void setNominee(String address)


	{
		this.address=address;
	}


	public String getAddress()


	{
		return this.address;
	}


	public void setBookname(String bookname)


	{
		this.bookname=bookname;
	}


	public String getBookname()


	{
		return this.bookname;
	}




}
