package net.octopvp.commanderbukkittest.commands;

import net.octopvp.commander.annotation.Command;
import net.octopvp.commander.annotation.Optional;
import net.octopvp.commander.annotation.Range;
import net.octopvp.commander.annotation.Sender;
import org.bukkit.entity.Player;

public class TestCommand {
    @Command(name = "test", description = "test")
    public void test(@Sender Player player, @Range(min = 0, max = 10, defaultValue = -3) @Optional Integer i) {
        player.sendMessage("Hello World! " + i);
    }
}
