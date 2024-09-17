package Assignment_Week1day2;

public class LibraryManagement 
{

	public static void main(String[] args) 
	{
		Library libra = new Library();
		String BT=libra.addBook("Wings Of Fire");
		System.out.println("Book Name: " + BT);
		libra.issueBook();

	}

}
