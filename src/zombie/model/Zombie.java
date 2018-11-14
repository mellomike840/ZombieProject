package zombie.model;

import javax.swing.JOptionPane;

public class Zombie
{

	
	private String name;
	private String favoriteNumber;
	private String favoriteInstrument;
	
	
	public Zombie()
	{
		//Default Constructor
	}
	
	//Constructor
	public Zombie(String name, String favoriteNumber, String favoriteInstrument)
	{
		this.name = name;
		this.favoriteNumber = favoriteNumber;
		this.favoriteInstrument = favoriteInstrument;
	}
	
	
	
	//object methods
	public void sayStuff()
	{
		JOptionPane.showMessageDialog(null, name + ": " + favoriteNumber + " adsfasdfasjkdhgfakshdgf " + favoriteInstrument);
	}
	
	
	


	//getters and setters 
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public String getFavoriteNumber()
	{
		return favoriteNumber;
	}
	
	public void setFavoriteNumber(String favoriteNumber)
	{
		this.favoriteNumber = favoriteNumber;
	}
	
	public String getFavoriteInstrument()
	{
		return favoriteInstrument;
	}
	
	public void setFavoriteInstrument(String favoriteInstrument)
	{
		this.favoriteInstrument = favoriteInstrument;
	}
	
	
	
	
	
}
