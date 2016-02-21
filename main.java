package com.applec.spigot;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin
{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd,  String label, String[] args){
		if(label.equalsIgnoreCase("obuolys")){
			if (sender instanceof Player){
				Player p = (Player) sender;
					sender.sendMessage(ChatColor.GREEN + "*" + ChatColor.AQUA + "Gavai savo obuolius" + ChatColor.GREEN + "*");
					PlayerInventory i = p.getInventory();
					i.addItem(new ItemStack(Material.APPLE, 16));
					Location vieta = p.getLocation();
					p.getWorld().playEffect(vieta, Effect.FLAME, 4);
			return true;
			} 
		}
		return false;
	}
}	