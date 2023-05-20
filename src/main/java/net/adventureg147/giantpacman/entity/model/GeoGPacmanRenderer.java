package net.adventureg147.giantpacman.entity.model;

import net.adventureg147.giantpacman.entity.custom.GeoGPacmanEntity;
import net.adventureg147.giantpacman.entity.render.GeoGPacmanModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GeoGPacmanRenderer extends GeoEntityRenderer<GeoGPacmanEntity> {
    public GeoGPacmanRenderer(EntityRendererManager renderManager) {
        super(renderManager, new GeoGPacmanModel());
        this.shadowRadius = 3;
    }
}
