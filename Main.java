package pw.httpd.Every_Generic_Plugin_Ever;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	FileConfiguration config = getConfig();
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		config.options().copyDefaults(true);
		saveConfig();
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {
		
		Player p = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("?") || cmd.getName().equalsIgnoreCase("pl") || cmd.getName().equalsIgnoreCase("plugins") || cmd.getName().equalsIgnoreCase("version")) {
			p.sendMessage(ChatColor.RED + "Your plugins have been blocked.");
		}
		
		if (cmd.getName().equalsIgnoreCase("heal")) {
			p.sendMessage(ChatColor.GREEN + "You've been healed m8");
			p.setHealth(20);
		}
		
		if (cmd.getName().equalsIgnoreCase("feed")) {
			p.sendMessage(ChatColor.GREEN + "You've been fed m8");
			p.setFoodLevel(20);
		}
		
		if (cmd.getName().equalsIgnoreCase("clearchat")) {
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage("");
			getServer().broadcastMessage(ChatColor.DARK_AQUA + "CHAT CLEARED BY " + p.getName());
		}
		
		if (cmd.getName().equalsIgnoreCase("fakeop")) {
			if (args.length == 0) {
				sender.sendMessage(ChatColor.RED + "Please specify the target. ya weiner.");
				return true;
			}
			
			Player target = (Bukkit.getServer().getPlayer(args[0]));
	        if (target == null) {
	           sender.sendMessage(args[0] + " is not online!");
	           
	           
	           return true;
		}
	        target.sendMessage(ChatColor.YELLOW + "You are now!");
	        sender.sendMessage(ChatColor.GREEN + target.getName() + " has offically been OP'd.");
		
		
		return true;
	}
		return true;
	}

}
