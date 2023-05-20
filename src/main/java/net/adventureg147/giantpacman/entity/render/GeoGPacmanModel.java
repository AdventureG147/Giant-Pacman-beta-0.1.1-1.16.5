package net.adventureg147.giantpacman.entity.render;

import net.adventureg147.giantpacman.entity.custom.GeoGPacmanEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GeoGPacmanModel extends AnimatedGeoModel{

    @Override
    public ResourceLocation getModelLocation(Object object) {
        return null;
    }

    @Override
    public ResourceLocation getTextureLocation(Object object) {
        return null;
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
        return null;
    }
}
