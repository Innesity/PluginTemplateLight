import org.bukkit.Color;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

public final class Start extends SimplePlugin {

	@Override
	protected void onPluginStart() {
		if(false){
			System.out.print(Color.RED + "Plugin Disabled");
		}
		else{
			System.out.print(Color.GREEN + "Plugin started");
		}
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
}