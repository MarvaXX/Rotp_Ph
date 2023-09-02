package com.cmdrorion.rotp_ph.init;

import java.util.function.Supplier;

import com.cmdrorion.rotp_ph.RotpPhAddon;
import com.github.standobyte.jojo.init.ModSounds;
import com.github.standobyte.jojo.util.mc.OstSoundList;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class InitSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RotpPhAddon.MOD_ID);

    public static final RegistryObject<SoundEvent> USER_PURPLEHAZE_STAND = SOUNDS.register("user_purplehaze_stand", 
        () -> new SoundEvent(new ResourceLocation(RotpPhAddon.MOD_ID, "user_purplehaze_stand")));

    public static final Supplier<SoundEvent> PURPLEHAZE_STAND_SUMMON = ModSounds.STAND_SUMMON_DEFAULT;

    public static final Supplier<SoundEvent> PURPLEHAZE_STAND_UNSUMMON = ModSounds.STAND_UNSUMMON_DEFAULT;

    public static final Supplier<SoundEvent> PURPLEHAZE_STAND_PUNCH_LIGHT = ModSounds.STAND_PUNCH_LIGHT;

    public static final Supplier<SoundEvent> PURPLEHAZE_STAND_PUNCH_HEAVY = ModSounds.STAND_PUNCH_HEAVY;

    public static final Supplier<SoundEvent> PURPLEHAZE_STAND_BARRAGE = ModSounds.STAND_PUNCH_LIGHT;

    public static final RegistryObject<SoundEvent> PURPLEHAZE_STAND_UGH = SOUNDS.register("purplehaze_stand_ugh", 
            () -> new SoundEvent(new ResourceLocation(RotpPhAddon.MOD_ID, "purplehaze_stand_ugh")));
    
    public static final RegistryObject<SoundEvent> PURPLEHAZE_STAND_USHUA = SOUNDS.register("purplehaze_stand_ushua", 
            () -> new SoundEvent(new ResourceLocation(RotpPhAddon.MOD_ID, "purplehaze_stand_ushua")));


    static final OstSoundList PURPLEHAZE_STAND_OST = new OstSoundList(new ResourceLocation(RotpPhAddon.MOD_ID, "purplehaze_stand_ost"), SOUNDS);

}