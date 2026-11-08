package com.example.hidetab;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * HideTab - client-side mod that hides the player list shown when holding Tab.
 */
@Mod(HideTabMod.MODID)
public class HideTabMod {
    public static final String MODID = "hidetab";

    public HideTabMod() {
        // Nothing to set up; the event subscriber below does all the work.
    }

    @Mod.EventBusSubscriber(modid = MODID, value = Dist.CLIENT)
    public static class ClientEvents {
        @SubscribeEvent
        public static void onRenderOverlay(RenderGuiOverlayEvent.Pre event) {
            if (event.getOverlay() == VanillaGuiOverlay.PLAYER_LIST.type()) {
                event.setCanceled(true);
            }
        }
    }
}
