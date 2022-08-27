package org.mineacademy.template;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

import java.awt.*;

public final class Start extends SimplePlugin {

	@Override
	protected void onPluginStart() {
		System.out.print(Color.GREEN + "Plugin has been enabled.");
	}

	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {
		if (event.getRightClicked().getType() == EntityType.PIG) {
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 2);
		}
		else{
				event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 6);
		}
	}

	@Override
	protected void onPluginDisable() {
		System.out.print(Color.RED + "Plugin has been disabled.");
	}
}
