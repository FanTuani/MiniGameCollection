package lwq.minigamecollection;

import lwq.minigamecollection.BasicRules.BasicCancellers;
import lwq.minigamecollection.BasicRules.Tips;
import lwq.minigamecollection.Commands.GrassClearerCommand;
import lwq.minigamecollection.Tools.GrassClearer;
import org.bukkit.plugin.java.JavaPlugin;

public final class MiniGameCollection extends JavaPlugin {

    @Override
    public void onEnable() {
        new BasicCancellers(this);
        new Tips(this);
        new GrassClearer(this);
        getCommand("grassclearer").setExecutor(new GrassClearerCommand());
    }

    @Override
    public void onDisable() {
    }
}
