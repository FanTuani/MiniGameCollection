package lwq.minigamecollection;

import lwq.minigamecollection.BasicRules.BasicCancellers;
import lwq.minigamecollection.BasicRules.Tips;
import org.bukkit.plugin.java.JavaPlugin;

public final class MiniGameCollection extends JavaPlugin {

    @Override
    public void onEnable() {
        new BasicCancellers(this);
        new Tips(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
