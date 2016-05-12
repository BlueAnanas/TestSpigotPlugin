/**
 * 
 */
package eu.sajuk.tsdev.testspigotplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;

/**
 * @author blaueszebra
 *
 */
public class CommandVersion implements CommandExecutor {
	TestSpigotPlugin plugin;

    public CommandVersion(TestSpigotPlugin plugin) {
        this.plugin = plugin;
    }

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
        String cmdName = cmd.getName().toLowerCase();

        if (!cmdName.equals("tspver")) return false;
        
        PluginDescriptionFile pd = plugin.getDescription();

        sender.sendMessage(pd.getFullName() + " ver. " + pd.getVersion() + " by " + String.join(", ", pd.getAuthors()));

        return true;
	}

}
