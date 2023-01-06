package net.adventureg147.giantpacman.entity.model;
// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.adventureg147.giantpacman.entity.custom.GiantPacmanEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.monster.ZombieEntity;

public class GiantPacmanModel<G extends ZombieEntity> extends EntityModel<GiantPacmanEntity> {
	private final ModelRenderer bone;
	private final ModelRenderer bone_top;
	private final ModelRenderer pacman_top;
	private final ModelRenderer backbone_top_r1;
	private final ModelRenderer teeth_top;
	private final ModelRenderer eyes;
	private final ModelRenderer brow_l_r1;
	private final ModelRenderer brow_r_r1;
	private final ModelRenderer eye_l_r1;
	private final ModelRenderer eye_r_r1;
	private final ModelRenderer bone_bottom;
	private final ModelRenderer pacman_bottom;
	private final ModelRenderer backbone_bottom_r1;
	private final ModelRenderer teeth_bottom;

	public GiantPacmanModel() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone_top = new ModelRenderer(this);
		bone_top.setRotationPoint(0.0F, -4.0F, 0.0F);
		bone.addChild(bone_top);
		

		pacman_top = new ModelRenderer(this);
		pacman_top.setRotationPoint(0.0F, -10.0F, 4.0F);
		bone_top.addChild(pacman_top);
		setRotationAngle(pacman_top, 0.5672F, 0.0F, -3.1416F);
		pacman_top.setTextureOffset(0, 12).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		pacman_top.setTextureOffset(0, 24).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		pacman_top.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
		pacman_top.setTextureOffset(14, 31).addBox(4.0F, -7.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		pacman_top.setTextureOffset(0, 31).addBox(-5.0F, -7.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		pacman_top.setTextureOffset(18, 26).addBox(5.0F, -7.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		pacman_top.setTextureOffset(24, 3).addBox(-6.0F, -7.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		backbone_top_r1 = new ModelRenderer(this);
		backbone_top_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		pacman_top.addChild(backbone_top_r1);
		setRotationAngle(backbone_top_r1, 0.0F, 1.5708F, 0.0F);
		backbone_top_r1.setTextureOffset(0, 24).addBox(-6.0F, -7.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		backbone_top_r1.setTextureOffset(24, 0).addBox(5.0F, -7.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		backbone_top_r1.setTextureOffset(24, 24).addBox(4.0F, -7.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		backbone_top_r1.setTextureOffset(26, 7).addBox(-5.0F, -7.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);

		teeth_top = new ModelRenderer(this);
		teeth_top.setRotationPoint(0.0F, 18.0F, 0.0F);
		pacman_top.addChild(teeth_top);
		teeth_top.setTextureOffset(32, 20).addBox(1.0F, -26.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth_top.setTextureOffset(32, 18).addBox(3.0F, -26.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth_top.setTextureOffset(16, 31).addBox(4.0F, -26.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth_top.setTextureOffset(12, 31).addBox(4.0F, -26.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth_top.setTextureOffset(28, 18).addBox(-4.0F, -26.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth_top.setTextureOffset(22, 26).addBox(-5.0F, -26.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth_top.setTextureOffset(24, 18).addBox(-5.0F, -26.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth_top.setTextureOffset(4, 18).addBox(-4.0F, -26.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth_top.setTextureOffset(0, 18).addBox(-2.0F, -26.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		eyes = new ModelRenderer(this);
		eyes.setRotationPoint(0.0F, 14.0F, 0.0F);
		pacman_top.addChild(eyes);
		

		brow_l_r1 = new ModelRenderer(this);
		brow_l_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		eyes.addChild(brow_l_r1);
		setRotationAngle(brow_l_r1, 0.0F, -0.5672F, 0.1745F);
		brow_l_r1.setTextureOffset(24, 16).addBox(-3.0F, -19.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		brow_r_r1 = new ModelRenderer(this);
		brow_r_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		eyes.addChild(brow_r_r1);
		setRotationAngle(brow_r_r1, 0.0F, 0.5672F, -0.1745F);
		brow_r_r1.setTextureOffset(18, 24).addBox(-1.0F, -19.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		eye_l_r1 = new ModelRenderer(this);
		eye_l_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		eyes.addChild(eye_l_r1);
		setRotationAngle(eye_l_r1, 0.0F, 0.5672F, 0.0F);
		eye_l_r1.setTextureOffset(0, 0).addBox(-3.0F, -21.0F, -6.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		eye_r_r1 = new ModelRenderer(this);
		eye_r_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		eyes.addChild(eye_r_r1);
		setRotationAngle(eye_r_r1, 0.0F, -0.5672F, 0.0F);
		eye_r_r1.setTextureOffset(0, 4).addBox(0.0F, -21.0F, -6.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		bone_bottom = new ModelRenderer(this);
		bone_bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_bottom);
		

		pacman_bottom = new ModelRenderer(this);
		pacman_bottom.setRotationPoint(0.0F, 1.0F, 2.0F);
		bone_bottom.addChild(pacman_bottom);
		setRotationAngle(pacman_bottom, 0.3054F, 0.0F, 0.0F);
		pacman_bottom.setTextureOffset(0, 15).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		pacman_bottom.setTextureOffset(24, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		pacman_bottom.setTextureOffset(0, 12).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
		pacman_bottom.setTextureOffset(36, 36).addBox(4.0F, -7.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		pacman_bottom.setTextureOffset(22, 34).addBox(-5.0F, -7.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		pacman_bottom.setTextureOffset(8, 31).addBox(5.0F, -7.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		pacman_bottom.setTextureOffset(0, 31).addBox(-6.0F, -7.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		backbone_bottom_r1 = new ModelRenderer(this);
		backbone_bottom_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		pacman_bottom.addChild(backbone_bottom_r1);
		setRotationAngle(backbone_bottom_r1, 0.0F, 1.5708F, 0.0F);
		backbone_bottom_r1.setTextureOffset(24, 26).addBox(-6.0F, -7.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		backbone_bottom_r1.setTextureOffset(0, 27).addBox(5.0F, -7.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		backbone_bottom_r1.setTextureOffset(32, 16).addBox(4.0F, -7.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		backbone_bottom_r1.setTextureOffset(32, 27).addBox(-5.0F, -7.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);

		teeth_bottom = new ModelRenderer(this);
		teeth_bottom.setRotationPoint(0.0F, 21.0F, 0.0F);
		pacman_bottom.addChild(teeth_bottom);
		teeth_bottom.setTextureOffset(34, 7).addBox(1.0F, -29.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth_bottom.setTextureOffset(22, 33).addBox(3.0F, -29.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth_bottom.setTextureOffset(13, 33).addBox(4.0F, -29.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth_bottom.setTextureOffset(32, 27).addBox(-5.0F, -29.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth_bottom.setTextureOffset(32, 25).addBox(-4.0F, -29.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		teeth_bottom.setTextureOffset(0, 34).addBox(-2.0F, -29.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(GiantPacmanEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}