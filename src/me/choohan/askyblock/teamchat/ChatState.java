package me.choohan.askyblock.teamchat;

import java.util.HashMap;

import org.bukkit.entity.Player;

public class ChatState {

	private static HashMap<String, String> teamChat = new HashMap<String, String>();
	
	public static void addTCMode (Player player){
		teamChat.put(player.getName(), "inTCMode");
	}
	
	public static boolean leaveTCMode (Player player){
		if (!inTCMode(player))
			return false;
		teamChat.remove(player.getName());
		return true;
	}
	
	public static boolean inTCMode (Player player){
		return teamChat.containsKey(player.getName());
		
	}

}
