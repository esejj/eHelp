package com.esej.eHelp;
 
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
 
public class Main extends JavaPlugin
{
    Logger log = Logger.getLogger("Console");
	private String tag;
 
    public void onEnable()
    {
        log.info("[eHelp] Enabled.");
    }
 
    public void onDisable()
    {
        log.info("[eHelp] Disabled.");
    }
 
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        if (cmd.getName().equalsIgnoreCase("help"))
        {
            tag = (ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "eHelp" + ChatColor.DARK_GRAY + "]");
            sender.sendMessage(tag + ChatColor.RED + " Tu w przyszlosci bedzie skonfigurowana twoja wiadomosc!");
            return true;
        }
        return false;
    }
}
