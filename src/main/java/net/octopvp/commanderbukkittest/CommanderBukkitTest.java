package net.octopvp.commanderbukkittest;

import net.octopvp.commander.Commander;
import net.octopvp.commander.bukkit.BukkitCommander;
import net.octopvp.commanderbukkittest.commands.TestCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommanderBukkitTest extends JavaPlugin {

    private static Commander commander;

    @Override
    public void onEnable() {
        commander = BukkitCommander.getCommander(this)
                .register(new TestCommand())
        ;

        commander.getCommandMap().forEach((k,v) -> {
            getLogger().info("Registered command: " + k + " | " + v);
        });
        getLogger().info("Registered " + commander.getCommandMap().size() + " commands.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
