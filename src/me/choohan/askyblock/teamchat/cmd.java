package me.choohan.askyblock.teamchat;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class cmd implements CommandExecutor {
	
	// Define main and plugin variable
	main plugin;

	public cmd(main instance) {
		plugin = instance;
		}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String commandlabel, String[] args) {
		if(sender instanceof Player){
			Player player = (Player) sender;
			if (ChatState.inTCMode(player)){
				ChatState.leaveTCMode(player);
				ChatUtilities.message(player, "Disabled team chat mode!");
			}else{
				ChatState.addTCMode(player);
				ChatUtilities.message(player, "Enabled team chat mode!");
			}
			
		}
		
		return true;
	}

}
