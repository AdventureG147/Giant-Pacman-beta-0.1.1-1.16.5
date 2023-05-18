package net.adventureg147.giantpacman.entity.render;

import net.adventureg147.giantpacman.GiantPacman;
import net.adventureg147.giantpacman.entity.custom.GiantPacmanEntity;
import net.adventureg147.giantpacman.entity.model.GiantPacmanModel;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class GiantPacmanRenderer extends GeoEntityRenderer implements IGeoRenderer {
    protected static final ResourceLocation TEXTURE
            = new ResourceLocation(GiantPacman.MOD_ID, "textures/entity/pacman_texture.png");

    public GiantPacmanRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new AnimatedGeoModel() {
            @Override
            public ResourceLocation getModelLocation(Object object) {
                return null;
            }

            @Override
            public ResourceLocation getTextureLocation(Object object) {
                return null;
            }

            @Override
            public ResourceLocation getAnimationFileLocation(Object animatable) {
                return null;
            }
        });

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


 