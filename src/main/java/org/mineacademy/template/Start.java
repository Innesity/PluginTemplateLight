package org.mineacademy.template;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 *
 * It uses Foundation for fast and efficient development process.
 */
public final class Start extends SimplePlugin {

	@Override
	protected void onPluginStart() {
		System.out.println("Plugin enabled.");
	}

	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {
		if (event.getRightClicked().getType() == EntityType.PIG) {
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 2);
		}
		else{
			if(event.getRightClicked().getType() != EntityType.PIG) {
				event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 6);
			}
		}
	}

	@Override
	protected void onPluginDisable() {
		System.out.println("Plugin disabled.");
	}
}
