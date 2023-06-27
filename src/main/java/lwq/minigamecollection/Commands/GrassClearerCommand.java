package lwq.minigamecollection.Commands;

import lwq.minigamecollection.Tools.GrassClearer;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GrassClearerCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(sender instanceof Player)) return false;
        if (!sender.isOp()) return false;
        if (!s.equalsIgnoreCase("grassclearer")) return false;
        if(!GrassClearer.isClearingGrass) sender.getServer().broadcastMessage(ChatColor.GREEN + "GrassClearer Enabled");
        if(GrassClearer.isClearingGrass) sender.getServer().broadcastMessage(ChatColor.YELLOW + "GrassClearer Disabled");
        GrassClearer.isClearingGrass = !GrassClearer.isClearingGrass; // op玩家用指令开除草
        return true;
    }
}
