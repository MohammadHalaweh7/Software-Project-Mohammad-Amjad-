package project2021;

public class Book {
	private String ISBN;
	private String Title;
	private String Aouther;
	private String Signature;
		
	public void setISBN(String ISBN) 
	{
		this.ISBN=ISBN;
	}
	
    public void setTitle (String Title) 
    {
	this.Title=Title;
    }
    public void setAouther(String Aouther)
    {
	this.Aouther=Aouther;
    }
    
    public void setSignature(String Signature) 
    {
		this.Signature=Signature;
	}
	
   	
	public String getTitle() 
	{
		return Title;	
	}
	public String getAouther()
	{
		return Aouther;
	}
	
	

	public String getISBN() 
	{
		return ISBN;
    }
	public String getSignature()
	{
		return Signature;
    }

	
	
}
