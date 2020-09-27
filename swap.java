package swaptest2.second;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class swap implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(args[0].length()>0 && args[1].length()>0){
            Second.targeted2 = Bukkit.getPlayer(args[1]);
            Location PlayerLocation = Second.targeted2.getLocation();
            Second.targeted = Bukkit.getPlayer(args[0]);
            Location targetedLocation = Second.targeted.getLocation();
            Second.targeted.sendMessage("swapping...");
            Second.targeted2.sendMessage("swapping...");
            Second.targeted2.teleport(targetedLocation);
            Second.targeted.teleport(PlayerLocation);
            Second.started=true;
            System.out.println("Successfully teleported");

        }


        return false;
    }
}