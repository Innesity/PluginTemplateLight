package org.mineacademy.template;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.mineacademy.fo.plugin.SimplePlugin;

import java.awt.*;

public final class Start extends JavaPlugin {

	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {
		if (event.getRightClicked().getType() == EntityType.PIG) {
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 2);
		}
		else{
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 6);
		}
	}
}