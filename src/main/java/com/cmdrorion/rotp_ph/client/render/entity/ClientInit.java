package com.cmdrorion.rotp_ph.client;

import com.cmdrorion.rotp_ph.RotpPhAddon;
import com.cmdrorion.rotp_ph.client.render.entity.renderer.stand.PurpleHaze_Renderer;
import com.cmdrorion.rotp_ph.init.AddonStands;
import com.cmdrorion.rotp_ph.init.InitEntities;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = RotpPhAddon.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientInit {

	@SubscribeEvent
	public static void onFMLClientSetup(FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(AddonStands.PURPLEHAZE_STAND.getEntityType(), PurpleHaze_Renderer::new);
	}
}