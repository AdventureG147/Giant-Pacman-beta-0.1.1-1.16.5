package net.adventureg147.giantpacman.events;

import net.adventureg147.giantpacman.GiantPacman;
import net.adventureg147.giantpacman.entity.ModEntityTypes;
import net.adventureg147.giantpacman.entity.custom.GeoGPacmanEntity;
import net.adventureg147.giantpacman.entity.render.GeoGPacmanRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import software.bernie.example.registry.EntityRegistry;

@Mod.EventBusSubscriber(modid = GiantPacman.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put((EntityType<? extends LivingEntity>) ModEntityTypes.GIANT_PACMAN.get(),
                (AttributeModifierMap) GeoGPacmanEntity.setCustomAttributes().build());
    }


    public static void registerRenderers(final RenderingRegistry event) {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GIANT_PACMAN.get(),
                GeoGPacmanRenderer::new);
    }

}
