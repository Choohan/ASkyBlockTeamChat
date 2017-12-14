package me.choohan.askyblock.teamchat;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;



public class main extends JavaPlugin{
	
	public void onEnable(){

		registerListener();
		registerCommand();
	}

	public void registerListener() {

		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new event(this), this);
		
	}

	// Register Command Executor
	public void registerCommand(){
	    getCommand("tchat").setExecutor(new cmd(this));
	}

}
