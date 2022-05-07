package xero.tageszeiten.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Tageszeiten implements CommandExecutor {

   // public Tageszeiten(Main plugin) {
    //}


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            String playerName = player.getName();

            //if (command.getName().equalsIgnoreCase("guten")) {
                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("morgen")) {
                        player.sendMessage("§7[§aTageszeiten§7] Guten Morgen §6" + playerName);

                    } else if (args[0].equalsIgnoreCase("mittag")) {
                        player.sendMessage("§7[§aTageszeiten§7] Guten Mittag §6" + playerName);

                    } else if (args[0].equalsIgnoreCase("abend")) {
                        player.sendMessage("§7[§aTageszeiten§7] Guten Abend §6" + playerName);

                    } else {

                        player.sendMessage("§7[§aTageszeiten§7] Bitte gibt eine dieser Tageszeiten ein: §aMorgen§7, §aMittag§7, §aAbend§7.");

                    }

                } else {
                    player.sendMessage("§7[§aTageszeiten§7] /guten <§aTageszeit§7>");
                }

                //}


            //}

        }return false;
    }
}
