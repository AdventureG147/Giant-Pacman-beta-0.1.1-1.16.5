package net.adventureg147.giantpacman.entity.model;

import net.adventureg147.giantpacman.GiantPacman;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GeoGPacmanModel extends AnimatedGeoModel{
    private static final ResourceLocation modelResource = new ResourceLocation(GiantPacman.MOD_ID, "geo/giant_pacman.geo.json");
    private static final ResourceLocation textureResource = new ResourceLocation(GiantPacman.MOD_ID, "textures/entity/pacman_texture.png");
    private static final ResourceLocation animationResource = new ResourceLocation(GiantPacman.MOD_ID, "animations/pac_chomp.animation.json");

    @Override
    public ResourceLocation getModelLocation(Object object) {
        return modelResource;
    }

    @Override
    public ResourceLocation getTextureLocation(Object object) {
        return textureResource;
    }

    /**
     * This resource location needs to point to a json file of your animation file,
     * i.e. "geckolib:animations/frog_animation.json"
     *
     * @param animatable
     * @return the animation file location
     */
    @Override
    public ResourceLocation getAnimationFileLocation(Object animatable) {
        return animationResource;
    }
}
