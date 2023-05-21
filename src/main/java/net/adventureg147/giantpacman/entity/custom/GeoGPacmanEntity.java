package net.adventureg147.giantpacman.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.RavagerEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.BusBuilder;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GeoGPacmanEntity extends RavagerEntity implements IAnimatable {

    public GeoGPacmanEntity(EntityType<? extends RavagerEntity> p_i50197_1_, World p_i50197_2_) {
        super(p_i50197_1_, p_i50197_2_);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return RavagerEntity.createAttributes()
                .add(Attributes.MAX_HEALTH, 100.0D)
                .add(Attributes.ATTACK_DAMAGE, 30.0D)
                .add(Attributes.FOLLOW_RANGE, 100.0D)
                .add(Attributes.MOVEMENT_SPEED, 1.0D);
    }

    private <T extends IAnimatable> PlayState predicate(AnimationEvent<T> tAnimationEvent) {
        tAnimationEvent.getController().setAnimation(new AnimationBuilder().addAnimation
                ("pacman.animation.chomp", ILoopType.EDefaultLoopTypes.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<>(this,
                "giantpacmancontroller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.getFactory();
    }
}
