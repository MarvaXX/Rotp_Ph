package com.github.standobyte.jojo.potion;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.DamageSource;

public class PoisonEffect extends Effect {

    public PoisonEffect() {
        super(EffectType.HARMFUL, 0xAA00AA);
    }

    @Override
    public void performEffect(LivingEntity entityLiving, int amplifier) {

        // Example: Apply 1 heart of damage every 20 ticks (1 second).
        if (entityLiving.getHealth() > 1.0F) {
            entityLiving.attackEntityFrom(DamageSource.MAGIC, 0.01F); // 2.0F damage
        }
    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        return duration % 5 == 0;
    }
}