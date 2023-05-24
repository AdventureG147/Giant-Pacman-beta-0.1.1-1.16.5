package net.adventureg147.giantpacman.entity.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.adventureg147.giantpacman.GiantPacman;
import net.adventureg147.giantpacman.entity.custom.GeoGPacmanEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GeoGPacmanRenderer extends GeoEntityRenderer<GeoGPacmanEntity> {
    public GeoGPacmanRenderer(EntityRendererManager renderManager) {
        super(renderManager, new net.adventureg147.giantpacman.entity.model.GeoGPacmanModel());
        this.shadowRadius = 3;
    }

    @Override
    public void renderEarly(GeoGPacmanEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
                            IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn, red, green, blue, partialTicks);
    }

    	@Override
    	public ResourceLocation getTextureLocation(GeoGPacmanEntity entity) {
    		return new ResourceLocation(GiantPacman.MOD_ID, "textures/entity/pacman_texture.png");
    	}

    	@Override
    	public RenderType getRenderType(GeoGPacmanEntity animatable, float partialTicks,
                                        MatrixStack stack, IRenderTypeBuffer renderTypeBuffer,
                                        IVertexBuilder vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
    		return RenderType.entityTranslucent(getTextureLocation(animatable));
    	}

    	@Override
    	public void renderRecursively(GeoBone bone, MatrixStack matrixStack, IVertexBuilder bufferIn,
                                      int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
    		super.renderRecursively(bone, matrixStack, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    	}

	@Override
	protected float getDeathMaxRotation(GeoGPacmanEntity entity) {
		return 0.0F;
	}

}
