package me.indian.pl.Utils;

import cn.nukkit.Player;
import cn.nukkit.utils.Config;
import me.indian.pl.Listeners.InputListener;
import me.indian.pl.OsTag;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.user.User;

import static me.indian.pl.Utils.PlayerInfoUtil.*;

public class OsTagAdd {
    private final OsTag plugin;

    public OsTagAdd(OsTag plugin) {
        this.plugin = plugin;
    }


    public static void addDevNormal(Player p, OsTag plugin) {

        Config conf = plugin.getConfig();

        p.setNameTag(conf.getString("nick")
                        .replace("<name>", p.getDisplayName())
                        .replace("<suffix>", getLuckPermSufix(p, plugin))
                        .replace("<prefix>", getLuckPermPrefix(p, plugin))
                        .replace("<groupDisName>" , getGroupDisName(p , plugin))
                        + "\n" + conf.getString("subtag")
//subtag replaces
                        .replace("<device>", getDevice(p, plugin))
                        .replace("§7", "§7")
                        .replace("<controler>", getControler(p, plugin))
                        .replace("<health>", p.getHealth() + "")
                        .replace("<max_health>", p.getMaxHealth() + "")
                        .replace("<model>", p.getLoginChainData().getDeviceModel() + "")
                        .replace("<version>", p.getLoginChainData().getGameVersion())
                        .replace("<xuid>", getXuid(p))
                        .replace("<language>", p.getLoginChainData().getLanguageCode())
                        .replace("<ping>", getPing(p))
                        .replace("<suffix>", getLuckPermSufix(p, plugin))
                        .replace("<preffix>", getLuckPermPrefix(p, plugin))
                        .replace("<xp>", getXp(p, plugin))
                        .replace("<cps>", String.valueOf(InputListener.getCPS(p)))
                        .replace("<gamemode>", getGameMode(p, plugin))


        );
    }

    public static void addDevAdvanced(Player p, OsTag plugin) {

        Config conf = plugin.getConfig();

        p.setNameTag(conf.getString("a-nick")
                        .replace("<suffix>", getLuckPermSufix(p, plugin))
                        .replace("<prefix>", getLuckPermPrefix(p, plugin))
                        .replace("<name>", p.getDisplayName())
                        .replace("<groupDisName>" , getGroupDisName(p , plugin))
                        + "\n" + conf.getString("a-subtag")
//subtag replaces
                        .replace("<device>", getDevice(p, plugin))
                        .replace("§7", "§7")
                        .replace("<controler>", getControler(p, plugin))
                        .replace("<health>", p.getHealth() + "")
                        .replace("<max_health>", p.getMaxHealth() + "")
                        .replace("<model>", p.getLoginChainData().getDeviceModel() + "")
                        .replace("<version>", p.getLoginChainData().getGameVersion())
                        .replace("<xuid>", getXuid(p))
                        .replace("<language>", p.getLoginChainData().getLanguageCode())
                        .replace("<ping>", getPing(p))
                        .replace("<suffix>", getLuckPermSufix(p, plugin))
                        .replace("<preffix>", getLuckPermPrefix(p, plugin))
                        .replace("<xp>", getXp(p, plugin))
                        .replace("<cps>", String.valueOf(InputListener.getCPS(p)))
                        .replace("<gamemode>", getGameMode(p, plugin))

        );
    }

    public static void scoreTagNormal(Player p, OsTag plugin) {

        Config conf = plugin.getConfig();

        p.setScoreTag(conf.getString("subtag")
                .replace("<device>", getDevice(p, plugin))
                .replace("§7", "§7")
                .replace("<controler>", getControler(p, plugin))
                .replace("<health>", p.getHealth() + "")
                .replace("<max_health>", p.getMaxHealth() + "")
                .replace("<model>", p.getLoginChainData().getDeviceModel() + "")
                .replace("<version>", p.getLoginChainData().getGameVersion())
                .replace("<xuid>", getXuid(p))
                .replace("<language>", p.getLoginChainData().getLanguageCode())
                .replace("<ping>", getPing(p))
                .replace("<suffix>", getLuckPermSufix(p, plugin))
                .replace("<preffix>", getLuckPermPrefix(p, plugin))
                .replace("<xp>", getXp(p, plugin))
                .replace("<cps>", String.valueOf(InputListener.getCPS(p)))
                .replace("<gamemode>", getGameMode(p, plugin))
        );
    }

    public static void scoreTagAdvancd(Player p, OsTag plugin) {

        Config conf = plugin.getConfig();


        p.setScoreTag(conf.getString("a-subtag")
                .replace("<device>", getDevice(p, plugin))
                .replace("§7", "§7")
                .replace("<controler>", getControler(p, plugin))
                .replace("<health>", p.getHealth() + "")
                .replace("<max_health>", p.getMaxHealth() + "")
                .replace("<model>", p.getLoginChainData().getDeviceModel() + "")
                .replace("<version>", p.getLoginChainData().getGameVersion())
                .replace("<xuid>", getXuid(p))
                .replace("<language>", p.getLoginChainData().getLanguageCode())
                .replace("<ping>", getPing(p))
                .replace("<suffix>", getLuckPermSufix(p, plugin))
                .replace("<preffix>", getLuckPermPrefix(p, plugin))
                .replace("<xp>", getXp(p, plugin))
                .replace("<cps>", String.valueOf(InputListener.getCPS(p)))
                .replace("<gamemode>", getGameMode(p, plugin))
        );
    }
}