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

public class main extends JavaPlugin
{
	public void onEnable() 
	{
     
    }
   
    public void onDisable() 
    {
       
    }
    
	@Override
	public boolean onCommand(CommandSender s, Command c,  String l, String[] args)
	{
		if(l.equalsIgnoreCase("obuolys"))
		{
			if (s instanceof Player)
			{
				Player p = (Player) s;
					s.sendMessage(ChatColor.GREEN + "*" + ChatColor.AQUA + "Gavai savo obuolius" + ChatColor.GREEN + "*");
					PlayerInventory i = p.getInventory();
					i.addItem(new ItemStack(Material.APPLE, 16));
					Bukkit.broadcastMessage(ChatColor.AQUA + s.getName() + ChatColor.BOLD + "gavo 16 obuoliu");
					Location vieta = p.getLocation();
					p.getWorld().playEffect(vieta, Effect.FLAME, 4);
			return true;
			}
		}
		return false; 
		}
	}	