public class Special_Reader extends Account implements welcome
{

	@Override
	public void send()
	{
		System.out.println("Welcome to receipt distribution. This method will help you to realize whether you have paid or not.Let's start.");
	}

	
	public Special_Reader()
	{
		super();
	}
	public Special_Reader(String name,String Id,String nominee,String bookname)
	{
		super(name,Id,nominee,bookname);
	}

	protected boolean deposit()
		{

			return true;
		}
	



	public void printAccount()
	{
		System.out.println("Name is: "+super.name);
		System.out.println("ID is: "+super.Id);
		System.out.println("Address is: "+super.address);
		System.out.println("Bookname is: "+super.bookname);




	}



}
