package oops;

public class LiberaryItems 
{
	private String title;
	private String author;
	private String identifier;
	
	
	public LiberaryItems(String title, String author, String identifier) 
	{
		super();
		this.title = title;
		this.author = author;
		this.identifier = identifier;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getIdentifier() {
		return identifier;
	}


	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	public void DisplayInfo()
	{
		System.out.println("Title :" + title);
		System.out.println("Author :" + author );
		System.out.println("Identifier :" + identifier);
	}
	
}
