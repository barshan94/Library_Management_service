import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Library
{

	public static void main(String[] args)
	{
		Account t[]=new Account[4];

		Normal_Reader a=new Normal_Reader();
		a.send();
		t[0]=new Account("Sharnya","19-41115-3","Baridhara","Life is a game");
		t[1]=new Reader("Barshan","19-42299-3","Rampura","Life is not a playboy");
		t[2]=new Normal_Reader("Tonmoy","19-41333-2","Badda","Harrypotter");
		t[3]=new Special_Reader("Mohesh","20-6749-1","Uttara","Titanic");


		t[0]. printAccount();
		t[1]. printAccount();
		t[2]. printAccount();
		t[3]. printAccount();


		try
		{
			FileWriter myfile=new FileWriter("Receipt.txt");

			for(int i=0;i<t.length;i++)
			{
				myfile.write("Account Name: "+t[i].getName()+"\n");
				myfile.write("Account ID: "+t[i].getID()+"\n");
				myfile.write("Address: "+t[i].getAddress()+"\n");
				myfile.write("Purchased Book Name: "+t[i].getBookname()+"\n");
				myfile.write("Amount Paid: "+t[i].deposit()+"\n");
				
			}
			myfile.close();
			System.out.println();
			System.out.println("Succesfully file closed");
			Reader d=new Reader();
			d.send();
			Special_Reader b=new Special_Reader();
			b.send();
			Reader c=new Reader();
			c.send();

		}



		catch(IOException e)
		{
			System.out.println("Succesfully Done");
			e.printStackTrace();
		}
		try
		{

		File myfile = new File("Receipt.txt");
		Scanner myReader = new Scanner(myfile);

            while(myReader.hasNextLine())
		{


                System.out.println(myReader.nextLine());
		}

		}
	catch(IOException e)
        {
            System.out.println("File does not found");
            e.printStackTrace();

        }

	}

}
