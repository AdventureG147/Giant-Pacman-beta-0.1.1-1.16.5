package net.adventureg147.giantpacman.entity.render;

import net.adventureg147.giantpacman.GiantPacman;
import net.adventureg147.giantpacman.entity.custom.GiantPacmanEntity;
import net.adventureg147.giantpacman.entity.model.GiantPacmanModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GiantPacmanRenderer extends MobRenderer {
    protected static final ResourceLocation TEXTURE
            = new ResourceLocation(GiantPacman.MOD_ID, "textures/entity/pacman_texture_redesign.png");

    public GiantPacmanRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GiantPacmanModel(), 0.7F);
    }

    /**
     * Returns the location of an entity's texture.
     *
     * @param pEntity
     */
    @Override
    public ResourceLocation getTextureLocation(Entity pEntity) {
        return TEXTURE;
    }

}


 