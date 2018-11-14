package zombie.controller;

import zombie.model.Zombie;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class ZombieController
{
	private Zombie adam;
	private Zombie eve;
	private Zombie Heysoose;
	
	private ArrayList<Zombie> zombieList;
	
	ZombieController()
	{
		adam = new Zombie();
		eve = new Zombie();
		Heysoose = new Zombie();
		
		zombieList = new ArrayList<Zombie>();
		
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
		
		
		
		
		
		
		
		
		
		for(int index = 0; index < zombieList.size(); index++)
		{
			zombieList.get(index).sayStuff();
		}
		
		
		
		
		
	}
	
	
	
	
	public void addInfo(Zombie zombieName)
	{
		zombieList.add(zombieName);
	}

}
