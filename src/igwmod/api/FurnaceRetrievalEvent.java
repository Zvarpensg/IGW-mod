package igwmod.api;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.Event;

public class FurnaceRetrievalEvent extends Event{
    public ItemStack inputStack;
    public ItemStack resultStack;
    public final String key;

    public FurnaceRetrievalEvent(String key){
        this.key = key;
    }
}
