package swaptest2.second.tasks;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;
import swaptest2.second.Second;

import static org.bukkit.Bukkit.getServer;

public class countdown extends BukkitRunnable {

    Second plugin;

    public countdown(Second plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        if(Second.started) {
            getServer().dispatchCommand(Bukkit.getConsoleSender(), "swap " + Second.targeted.getDisplayName()+" "+Second.targeted2.getDisplayName());
            System.out.println("swapped");
        }else{
            System.out.println("you need to run the swap command first");
        }
    }
}
