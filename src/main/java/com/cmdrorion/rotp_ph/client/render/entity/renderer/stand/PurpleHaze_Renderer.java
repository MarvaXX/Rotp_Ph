package com.cmdrorion.rotp_ph.client.render.entity.renderer.stand;

import com.cmdrorion.rotp_ph.RotpPhAddon;
import com.cmdrorion.rotp_ph.client.render.entity.model.stand.PurpleHazeModel;
import com.cmdrorion.rotp_ph.entity.stand.stands.PurpleHaze_Entity;
import com.github.standobyte.jojo.client.render.entity.renderer.stand.StandEntityRenderer;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;


public class PurpleHaze_Renderer extends StandEntityRenderer<PurpleHaze_Entity, PurpleHazeModel> {
    
    public PurpleHaze_Renderer(EntityRendererManager renderManager) {
        super(renderManager, new PurpleHazeModel(), new ResourceLocation(RotpPhAddon.MOD_ID, "textures/entity/stand/purplehaze.png"), 0);
    }
}