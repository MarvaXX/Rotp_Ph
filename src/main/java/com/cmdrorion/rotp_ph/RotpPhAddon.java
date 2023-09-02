package com.cmdrorion.rotp_ph;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmdrorion.rotp_ph.init.InitEntities;
import com.cmdrorion.rotp_ph.init.InitSounds;
import com.cmdrorion.rotp_ph.init.InitStands;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RotpPhAddon.MOD_ID)
public class RotpPhAddon {
    // The value here should match an entry in the META-INF/mods.toml file
    public static final String MOD_ID = "rotp_ph";
    private static final Logger LOGGER = LogManager.getLogger();

    public RotpPhAddon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        InitEntities.ENTITIES.register(modEventBus);
        InitSounds.SOUNDS.register(modEventBus);
        InitStands.ACTIONS.register(modEventBus);
        InitStands.STANDS.register(modEventBus);
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}