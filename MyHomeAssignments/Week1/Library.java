package Assignment_Week1day2;

public class Library 
{

	public String addBook(String bookTitle) 
	{
		System.out.println("Book Added successfully ");
		return bookTitle;
	}

	public void issueBook() {
		System.out.println("Book Issued successfully");
	}

	public static void main(String[] args) {
		Library book = new Library();
		String BT=book.addBook("Wings Of Fire");
		System.out.println("Book Name: " + BT );
		book.issueBook();
	}

}
