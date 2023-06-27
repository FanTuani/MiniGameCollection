package lwq.minigamecollection.Tools;

import lwq.minigamecollection.MiniGameCollection;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class GrassClearer implements Listener {
    public final MiniGameCollection plugin;
    public static boolean isClearingGrass = false;

    public GrassClearer(MiniGameCollection plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void clearGrass(PlayerMoveEvent event) {
        if (!isClearingGrass) return;
        for (int i = -5; i <= 5; i++) {
            for (int j = -5; j <= 5; j++) {
                Location loc = event.getPlayer().getLocation();
                loc.setX(loc.getX() + i);
                loc.setZ(loc.getZ() + j);
                if(loc.getBlock().getType() == Material.GRASS || loc.getBlock().getType() == Material.TALL_GRASS) {
                    loc.getBlock().setType(Material.AIR);
                }
            }
        }
    }
}
