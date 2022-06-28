public class Reader extends Account implements welcome
{

	public Reader()

	{
		super();
	}

	public Reader(String name ,String Id,String address,String bookname)

	{
		super(name,Id,address,bookname);
	}

	protected boolean deposit()

	{
		

			return true;
	}



	@Override
	public void send()
	{
		System.out.println();
		System.out.println();
		
	}
	

	public void printAccount()
	{
		System.out.println("Name is: "+super.name);
		System.out.println("ID is: "+super.Id);
		System.out.println("Address is: "+super.address);
		System.out.println("Bookname is: "+super.bookname);


	}

}
