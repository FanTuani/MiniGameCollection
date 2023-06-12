package lwq.minigamecollection.BasicRules;

import io.papermc.paper.event.player.AsyncChatEvent;
import lwq.minigamecollection.MiniGameCollection;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;

public class Tips implements Listener {
    public final MiniGameCollection plugin;

    public Tips(MiniGameCollection plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void JoinWelcome(PlayerJoinEvent event) { // 玩家进入时提示标题+提示音
        for (Player player : plugin.getServer().getOnlinePlayers()) {
            if (player.getName().equals(event.getPlayer().getName()))
                player.sendTitle(ChatColor.GREEN + "WelCome!", "");
            else player.sendTitle(ChatColor.GREEN + event.getPlayer().getName() + " Joined!", "");
            player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.1F, 0.1F);
        }
    }

    @EventHandler
    public void onPlayerChat(AsyncChatEvent event) { // 聊天气泡音
        for (Player player : plugin.getServer().getOnlinePlayers()) {
            player.playSound(player.getLocation(), Sound.ENTITY_ITEM_PICKUP, 0.1F, 0.9F);
        }
    }
}
