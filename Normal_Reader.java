public class Normal_Reader extends Account implements welcome
{

	@Override
	public void send()
	{
		System.out.println("Welcome to BankAccount Management System. We are always hereby to serve you. Best of luck.");
		System.out.println();
	}
	
	
	public Normal_Reader()
	{
		super();
	}


	public Normal_Reader(String name ,String Id,String address,String bookname)


	{
		super(name,Id,address,bookname);
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
