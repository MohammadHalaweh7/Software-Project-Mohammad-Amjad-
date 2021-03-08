package project2021;

import java.util.ArrayList;

public class Library {

	static ArrayList<Book> books = new ArrayList<Book>();

	static ArrayList<Administrator> admins_Array = new ArrayList<Administrator>();
	Administrator admin=new Administrator();
	
	public static void addAdmin(String Username,String Password ) 
	{
		Administrator admin=new Administrator();
		admin.setUsername(Username);
		admin.setPassword(Password);
		admins_Array.add(admin);
	}
	

	public boolean logIn(String Username , String Password)
	{
		for (int i=0;i<admins_Array.size();i++)
		{
			if(admins_Array.get(i).getUsername().equals(Username) && admins_Array.get(i).getPassword().equals(Password))
			{
				return true;
			}

			else
			{
				return false;
			}	
		}
		return false;
	}
	
	public void logOut() 
	{
     admin.setLogedIN(false);
	
	}
	
	
	public static void add(String Title,String ISBN,String Aouther,String Signature )
	{
		Book book = new Book();
		book.setTitle(Title);
		book.setSignature(Signature);
		book.setAouther(Aouther);
		book.setISBN(ISBN);
		books.add(book);
		

	}

	public static Book get1(String Signature)
	{	
		for (Book book : books)
		{
		
			if ( Signature.equals(book.getSignature()))
			{	
			return book;
	     	}
		}
		return null;
	}
	
	

	public static Book search_title(String title)
	{

		for (Book book : books)
		{
			String title1 = book.getTitle();
			String[] tokens = title1.split(" ");
			for (String token : tokens) {
				if (token.contains(title.toLowerCase()))
				{
					return book;
				}
			}
			
		}	
		return null;
	}	
	
	public static Book search_author(String author) 
	{
		for (Book book : books)
		{
			String author1 = book.getAouther();
			String[] tokens = author1.split(" ");
			
			for (String token : tokens)
			{
				if (token.contains(author.toLowerCase())) 
				{
					return book;
				}
			}
			
		}
		return null;
	}
	
	public static Book search_ISBN(String ISBN) 
	{
		
		
		for (Book book : books)
		{
			String ISBN1 = book.getISBN();
			String[] tokens = ISBN1.split(" ");
			
			for (String token : tokens)
			{
				if (token.contains(ISBN.toLowerCase())) 
				{
					return book;
				}
			}
			
		}
		
		return null;
	
	}




	public void searchBook(String string, String string2, String string3, String string4)
	{
		for (Book book : books)
		{
//			String s1 = book.getISBN();
//			String s2 = book.getTitle();
//			String s3 = book.getAouther();
//     		String s4 = book.getSignature();
			for (int i=0;i<books.size();i++)
			{
				if(books.get(i).getTitle().equals(string) && books.get(i).getISBN().equals(string2) &&books.get(i).getAouther().equals(string3) &&books.get(i).getSignature().equals(string4) )
				{
					return;
				}	
			}
	     }
	}
	
	
	

}
