package net.adventureg147.giantpacman.entity.render;

import net.adventureg147.giantpacman.GiantPacman;
import net.adventureg147.giantpacman.entity.custom.GiantPacmanEntity;
import net.adventureg147.giantpacman.entity.model.GiantPacmanModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;

public class GiantPacmanRenderer extends MobRenderer<GiantPacmanEntity, GiantPacmanModel<GiantPacmanEntity>> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation(GiantPacman.MOD_ID, "textures/entity/pacman_texture.png");

    public GiantPacmanRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GiantPacmanModel<>(), 0.7F);
    }
    @Override
    public ResourceLocation getTextureLocation(GiantPacmanEntity pEntity) {
        return TEXTURE;
    }
}
