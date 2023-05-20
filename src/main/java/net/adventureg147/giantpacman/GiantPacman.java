package net.adventureg147.giantpacman;

import net.adventureg147.giantpacman.block.ModBlocks;
import net.adventureg147.giantpacman.entity.ModEntityTypes;
import net.adventureg147.giantpacman.entity.model.GeoGPacmanRenderer;
import net.adventureg147.giantpacman.entity.render.GeoGPacmanModel;
import net.adventureg147.giantpacman.item.ModItems;
import net.adventureg147.giantpacman.util.ModSoundEvents;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(GiantPacman.MOD_ID)
public class GiantPacman
{
    public static final String MOD_ID = "giantpacman";
    private static final Logger LOGGER = LogManager.getLogger();

    public GiantPacman() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModEntityTypes.register(eventBus);
        ModBlocks.register(eventBus);
        ModSoundEvents.register(eventBus);

        eventBus.addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(ModBlocks.PACMAN_TROPHY.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.GOLDEN_TROPHY.get(), RenderType.cutout());
        });
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GIANT_PACMAN.get(), GeoGPacmanRenderer::new);
    }

}
