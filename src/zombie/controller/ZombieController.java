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
		
		String userName = JOptionPane.showInputDialog("you're name:");
		adam.setName(userName);
	
		JOptionPane.showMessageDialog(null, "Your name is " + adam.getName() + ".");
		
		
		
		
		
	}
	
	
	public void addInfo(Zombie zombieName)
	{
		zombieList.add(zombieName);
	}

}
