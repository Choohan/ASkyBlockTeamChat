package me.choohan.askyblock.teamchat;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import com.wasteofplastic.askyblock.ASkyBlockAPI;

public class event implements Listener{

	
	public event(main main) {
		// TODO Auto-generated constructor stub
	}

	@EventHandler
	public static void onPlayerChat (PlayerChatEvent event){
		for (Player player : event.getRecipients()){
			Player p = event.getPlayer();
			if (ChatState.inTCMode(p)){
			UUID playeruuid = player.getUniqueId();
			UUID puuid = p.getUniqueId();
			if (ASkyBlockAPI.getInstance().inTeam(playeruuid)){
			if(ASkyBlockAPI.getInstance().getTeamLeader(playeruuid).equals(puuid) || ASkyBlockAPI.getInstance().getTeamMembers(playeruuid).contains(puuid)){

				if(ChatState.inTCMode(player)){
				}else{


					event.getRecipients().remove(player);
				}
			}else{

				event.getRecipients().remove(player);
			}
			}else{
				event.getRecipients().remove(player);
			}
		}else{
			return;
		}
		}
	}
}
