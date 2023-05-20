package net.adventureg147.giantpacman.events;

import net.adventureg147.giantpacman.GiantPacman;
import net.adventureg147.giantpacman.entity.ModEntityTypes;
import net.adventureg147.giantpacman.entity.custom.GeoGPacmanEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GiantPacman.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put((EntityType<? extends LivingEntity>) ModEntityTypes.GIANT_PACMAN.get(),
                (AttributeModifierMap) GeoGPacmanEntity.setCustomAttributes().build());
    }
}
