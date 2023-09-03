package com.cmdrorion.rotp_ph.init;

import com.cmdrorion.rotp_ph.RotpPhAddon;
import com.cmdrorion.rotp_ph.entity.stand.stands.PurpleHaze_Entity;
import com.github.standobyte.jojo.action.Action;
import com.github.standobyte.jojo.action.stand.StandAction;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.action.stand.StandEntityAction.Phase;
import com.github.standobyte.jojo.action.stand.StandEntityBlock;
import com.github.standobyte.jojo.action.stand.StandEntityHeavyAttack;
import com.github.standobyte.jojo.action.stand.StandEntityLightAttack;
import com.github.standobyte.jojo.action.stand.StandEntityMeleeBarrage;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.entity.stand.StandPose;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject;
import com.github.standobyte.jojo.init.power.stand.ModStandsInit;
import com.github.standobyte.jojo.power.impl.stand.StandInstance.StandPart;
import com.github.standobyte.jojo.power.impl.stand.stats.StandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;
import com.github.standobyte.jojo.power.impl.stand.type.StandType;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class InitStands {
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<Action<?>> ACTIONS = DeferredRegister.create(
            (Class<Action<?>>) ((Class<?>) Action.class), RotpPhAddon.MOD_ID);
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<StandType<?>> STANDS = DeferredRegister.create(
            (Class<StandType<?>>) ((Class<?>) StandType.class), RotpPhAddon.MOD_ID);
    
 // ======================================== Purple Haze Stand ========================================
    
    public static final RegistryObject<StandEntityAction> PURPLEHAZE_STAND_PUNCH = ACTIONS.register("purplehaze_stand_punch", 
            () -> new StandEntityLightAttack(new StandEntityLightAttack.Builder()
                    .punchSound(InitSounds.PURPLEHAZE_STAND_PUNCH_LIGHT)));
    
    public static final RegistryObject<StandEntityAction> PURPLEHAZE_STAND_BARRAGE = ACTIONS.register("purplehaze_stand_barrage", 
            () -> new StandEntityMeleeBarrage(new StandEntityMeleeBarrage.Builder()
                    .barrageHitSound(InitSounds.PURPLEHAZE_STAND_BARRAGE)
                    .standSound(InitSounds.PURPLEHAZE_STAND_USHUA)));
    
    public static final RegistryObject<StandEntityHeavyAttack> PURPLEHAZE_STAND_COMBO_PUNCH = ACTIONS.register("purplehaze_stand_combo_punch", 
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder()
                    .punchSound(InitSounds.PURPLEHAZE_STAND_PUNCH_HEAVY)
                    .partsRequired(StandPart.ARMS)));
    
    public static final RegistryObject<StandEntityHeavyAttack> PURPLEHAZE_STAND_HEAVY_PUNCH = ACTIONS.register("purplehaze_stand_heavy_punch", 
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder()
                    .punchSound(InitSounds.PURPLEHAZE_STAND_PUNCH_HEAVY)
                    .partsRequired(StandPart.ARMS)
                    .setFinisherVariation(PURPLEHAZE_STAND_COMBO_PUNCH)
                    .shiftVariationOf(PURPLEHAZE_STAND_PUNCH).shiftVariationOf(PURPLEHAZE_STAND_BARRAGE)));
    
    public static final RegistryObject<StandEntityAction> PURPLEHAZE_STAND_BLOCK = ACTIONS.register("purplehaze_stand_block", 
            () -> new StandEntityBlock());
    
    public static final EntityStandRegistryObject<EntityStandType<StandStats>, StandEntityType<PurpleHaze_Entity>> PURPLEHAZE_STAND = 
            new EntityStandRegistryObject<>("purple_haze", 
                    STANDS, 
                    () -> new EntityStandType<StandStats>(
                            0xAA00AA, ModStandsInit.PART_5_NAME,

                            new StandAction[] {
                                    PURPLEHAZE_STAND_PUNCH.get(), 
                                    PURPLEHAZE_STAND_BARRAGE.get()},
                            new StandAction[] {
                                    PURPLEHAZE_STAND_BLOCK.get()},

                            StandStats.class, new StandStats.Builder()
                            .tier(6)
                            .power(16.0)
                            .speed(12.0)
                            .range(3, 6.0)
                            .durability(8.0)
                            .precision(4.0)
                            .build("Purple Haze"), 

                            new StandType.StandTypeOptionals()
                            .addSummonShout(InitSounds.USER_PURPLEHAZE_STAND)
                            .addOst(InitSounds.PURPLEHAZE_STAND_OST)), 

                    InitEntities.ENTITIES, 
                    () -> new StandEntityType<PurpleHaze_Entity>(PurpleHaze_Entity::new, 0.65F, 1.95F)
                    .summonSound(InitSounds.PURPLEHAZE_STAND_SUMMON)
                    .unsummonSound(InitSounds.PURPLEHAZE_STAND_UNSUMMON))
            .withDefaultStandAttributes();
}