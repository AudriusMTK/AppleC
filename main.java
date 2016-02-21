package com.applec.spigot;

import org.bukkit.Bukkit;
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

public class main extends JavaPlugin{
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] args)
	{
		if(l.equalsIgnoreCase("obuolys"))
		{
			if (s instanceof Player)
			{
				Player p = (Player) s;
					s.sendMessage(ChatColor.GREEN + "*" + ChatColor.AQUA + "Gavai savo obuolius" + ChatColor.GREEN + "*");
					PlayerInventory i = p.getInventory();
					i.addItem(new ItemStack(Material.APPLE, 64));
					Location vieta = p.getLocation();
					p.getWorld().playEffect(vieta, Effect.WITCH_MAGIC, 1, 10_000);
					Bukkit.broadcastMessage(ChatColor.AQUA + p.getName() + " gavo 64 obuolius!");
			return true;
			} 
		}
		return false;
	}
}	