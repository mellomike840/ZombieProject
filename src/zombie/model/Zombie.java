package zombie.model;

public class Zombie
{

	
	private String name;
	
	
	public Zombie()
	{
		//Default Constructor
	}
	
	//Constructor
	public Zombie(String name)
	{
		this.name = name;
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
	
	
	
}
