package swaptest2.second;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import swaptest2.second.tasks.countdown;

public final class Second extends JavaPlugin {
    public static Player targeted;
    public static Player targeted2;
    public static boolean started = false;


    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("started swap plugin");
        getCommand("swap").setExecutor(new swap());

        BukkitTask task1 = new countdown(this).runTaskTimer(this, 12L, 12L);

        new BukkitRunnable() {
            int sec = 12;
            @Override
            public void run() {
                if (--sec <= 0) {
                    this.cancel();
                    // Do the final code here
                    return;
                }
                if(sec<=10){
                    targeted.sendMessage(sec+" seconds left!");
                    targeted2.sendMessage(sec+" seconds left!");
                }
            }
        }.runTaskTimer(this, 12L, 12L);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
