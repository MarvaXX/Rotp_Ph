package com.cmdrorion.rotp_ph.init;

import com.cmdrorion.rotp_ph.entity.stand.stands.PurpleHaze_Entity;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject.EntityStandSupplier;
import com.github.standobyte.jojo.power.impl.stand.stats.StandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;

public class AddonStands {

    public static final EntityStandSupplier<EntityStandType<StandStats>, StandEntityType<PurpleHaze_Entity>> 
    PURPLEHAZE_STAND = new EntityStandSupplier<>(InitStands.PURPLEHAZE_STAND);
}