package lwq.minigamecollection.BasicRules;

import lwq.minigamecollection.MiniGameCollection;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerLoginEvent;

public class BasicCancellers implements Listener {
    public final MiniGameCollection plugin;

    public BasicCancellers(MiniGameCollection plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void NoHunger(FoodLevelChangeEvent event) { // 无饥饿
        event.getEntity().setFoodLevel(20);
        event.setCancelled(true);
    }
}
