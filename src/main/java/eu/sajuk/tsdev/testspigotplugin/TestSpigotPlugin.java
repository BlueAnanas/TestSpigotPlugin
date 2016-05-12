/**
 * 
 */
package eu.sajuk.tsdev.testspigotplugin;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author blaueszebra
 *
 */
public class TestSpigotPlugin extends JavaPlugin {
    @Override
    public void onDisable() {
        // just here as a marker
    }

    @Override
    public void onEnable() {

        // Commands enabled with following method must have entries in plugin.yml
        getCommand("tspver").setExecutor(new CommandVersion(this));
    }

}
