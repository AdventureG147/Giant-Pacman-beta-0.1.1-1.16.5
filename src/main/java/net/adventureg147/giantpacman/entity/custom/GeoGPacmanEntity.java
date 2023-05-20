package net.adventureg147.giantpacman.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.RavagerEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.BusBuilder;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GeoGPacmanEntity extends RavagerEntity implements IAnimatable {

    public GeoGPacmanEntity(EntityType<? extends RavagerEntity> p_i50197_1_, World p_i50197_2_) {
        super(p_i50197_1_, p_i50197_2_);
    }

    public static BusBuilder setCustomAttributes() {
        return null;
    }


    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<>(this,
                "giantpacmancontroller", 0, this::predicate));
    }

    private <T extends IAnimatable> PlayState predicate(AnimationEvent<T> tAnimationEvent) {
        return null;
    }

    @Override
    public AnimationFactory getFactory() {
        return null;
    }
}
