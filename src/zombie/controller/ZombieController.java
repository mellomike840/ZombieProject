package zombie.controller;

import zombie.model.Zombie;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import zombie.view.images.*;


public class ZombieController
{
	//data members
	private Zombie adam;
	private Zombie eve;
	private Zombie Heysoose;
	private Zombie[] peopleList;
	private String[] imageList;
	private ArrayList<Zombie> zombieList;
	
	ZombieController()
	{
	//data member declaration
		
		//Zombies
		adam = new Zombie();
		eve = new Zombie();
		Heysoose = new Zombie();
		
		
		//Array Lists declaration
		zombieList = new ArrayList<Zombie>();
	
		imageList = new String[6];
		peopleList  = new Zombie[3];
		
		//adding Zombie objects to the array
		peopleList[0] = adam;
		peopleList[1] = eve;
		peopleList[2] = Heysoose;
		
		//adding images to the imagesList
		imageList[0] = "file:///Users/arot3696/eclipse-workspace/ZombieProject/src/zombie/view/images/emi.png";
		imageList[1] = "";
		imageList[2] = "";
		imageList[3] = "";
		imageList[4] = "";
		imageList[5] = "";

		
		JOptionPane.showMessageDialog(null, "file:///Users/arot3696/eclipse-workspace/ZombieProject/src/zombie/view/images/emi.png");
		
		
		
	}
	
	public void start()
	{
	
		String userInput = JOptionPane.showInputDialog("you're name:");
		adam.setName(userInput);
	
		JOptionPane.showMessageDialog(null, "Your name is " + adam.getName() + " Hernandez");
		
		userInput = JOptionPane.showInputDialog("you're favorite number:");
		adam.setFavoriteNumber(userInput);
		
		userInput = JOptionPane.showInputDialog("you're favorite instrument:");
		adam.setFavoriteInstrument(userInput);
		
		addInfo(adam);
		
		userInput = JOptionPane.showInputDialog("you're name:");
		eve.setName(userInput);
	
		JOptionPane.showMessageDialog(null, "Your name is " + eve.getName() + " Hernandez");
		
		userInput = JOptionPane.showInputDialog("you're favorite number:");
		eve.setFavoriteNumber(userInput);
		
		userInput = JOptionPane.showInputDialog("you're favorite instrument:");
		eve.setFavoriteInstrument(userInput);
		
		addInfo(eve);
		
		userInput = JOptionPane.showInputDialog("you're name:");
		Heysoose.setName(userInput);
	
		JOptionPane.showMessageDialog(null, "Your name is " + Heysoose.getName() + " Hernandez");
		
		userInput = JOptionPane.showInputDialog("you're favorite number:");
		Heysoose.setFavoriteNumber(userInput);
		
		userInput = JOptionPane.showInputDialog("you're favorite instrument:");
		Heysoose.setFavoriteInstrument(userInput);
		
		addInfo(Heysoose);
		
		displayPeople(peopleList, 3);
	
		for(int index = 0; index < zombieList.size(); index++)
		{
			
			//ArrayLists:
			zombieList.get(index).sayStuff();
		
		}
		

		
		
	}
	
	
	//displays and returns the list you provide and it's size
	public Zombie[] displayPeople(Zombie[] list, int size)
	{
		for(int i = 0; i < size; i++ )
		{
			list[i].sayStuff();
		}
		return list;
	}
	
	

	public void addInfo(Zombie zombieName)
	{	
		//ArrayList:
		zombieList.add(zombieName);
	
	}

}
