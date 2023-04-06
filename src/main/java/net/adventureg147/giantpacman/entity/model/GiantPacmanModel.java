package net.adventureg147.giantpacman.entity.model;// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.GeckoLib;

public class GiantPacmanModel extends EntityModel<Entity> {
    private final ModelRenderer Pacman;
    private final ModelRenderer Bottom;
    private final ModelRenderer Teeth_Bottom;
    private final ModelRenderer Tounge;
    private final ModelRenderer Tounge2;
    private final ModelRenderer tounge_2_r1;
    private final ModelRenderer Tounge1;
    private final ModelRenderer tounge_1_r1;
    private final ModelRenderer Top;
    private final ModelRenderer Teeth_Top;
    private final ModelRenderer Eyes;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;

    public GiantPacmanModel() {
        texWidth = 128;
        texHeight = 128;

        Pacman = new ModelRenderer(this);
        Pacman.setPos(0.0F, 23.0F, 0.0F);
        setRotationAngle(Pacman, 0.0F, 3.1416F, 0.0F);


        Bottom = new ModelRenderer(this);
        Bottom.setPos(0.0F, -8.0F, -8.0F);
        Pacman.addChild(Bottom);
        setRotationAngle(Bottom, -0.2182F, 0.0F, 0.0F);
        Bottom.texOffs(52, 29).addBox(-3.0F, 5.5117F, 4.5893F, 6.0F, 1.0F, 6.0F, 0.0F, false);
        Bottom.texOffs(0, 16).addBox(-5.0F, -0.4883F, 2.5893F, 10.0F, 6.0F, 10.0F, 0.0F, false);
        Bottom.texOffs(12, 37).addBox(-7.0F, -1.4883F, 2.5893F, 1.0F, 5.0F, 10.0F, 0.0F, false);
        Bottom.texOffs(64, 42).addBox(-5.0F, -1.4883F, 0.5893F, 10.0F, 5.0F, 1.0F, 0.0F, false);
        Bottom.texOffs(0, 61).addBox(-5.0F, -1.4883F, 13.5893F, 10.0F, 5.0F, 1.0F, 0.0F, false);
        Bottom.texOffs(0, 32).addBox(6.0F, -1.4883F, 2.5893F, 1.0F, 5.0F, 10.0F, 0.0F, false);
        Bottom.texOffs(42, 21).addBox(-6.0F, -1.4883F, 1.5893F, 12.0F, 6.0F, 2.0F, 0.0F, false);
        Bottom.texOffs(42, 8).addBox(-6.0F, -1.4883F, 11.5893F, 12.0F, 6.0F, 2.0F, 0.0F, false);
        Bottom.texOffs(38, 51).addBox(4.0F, -1.4883F, 3.5893F, 2.0F, 6.0F, 8.0F, 0.0F, false);
        Bottom.texOffs(0, 47).addBox(-6.0F, -1.4883F, 3.5893F, 2.0F, 6.0F, 8.0F, 0.0F, false);
        Bottom.texOffs(16, 66).addBox(-8.0F, -1.4883F, 4.5893F, 1.0F, 3.0F, 6.0F, 0.0F, false);
        Bottom.texOffs(34, 65).addBox(7.0F, -1.4883F, 4.5893F, 1.0F, 3.0F, 6.0F, 0.0F, false);
        Bottom.texOffs(68, 19).addBox(-3.0F, -1.4883F, -0.4107F, 6.0F, 3.0F, 1.0F, 0.0F, false);
        Bottom.texOffs(8, 67).addBox(-3.0F, -1.4883F, 14.5893F, 6.0F, 3.0F, 1.0F, 0.0F, false);

        Teeth_Bottom = new ModelRenderer(this);
        Teeth_Bottom.setPos(0.0F, 6.5117F, 7.5893F);
        Bottom.addChild(Teeth_Bottom);
        Teeth_Bottom.texOffs(0, 38).addBox(2.0F, -9.0F, 4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Teeth_Bottom.texOffs(0, 35).addBox(-1.0F, -9.0F, 5.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Teeth_Bottom.texOffs(0, 32).addBox(-4.0F, -9.0F, 4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Teeth_Bottom.texOffs(30, 21).addBox(-6.0F, -9.0F, 1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Teeth_Bottom.texOffs(30, 6).addBox(-7.0F, -9.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Teeth_Bottom.texOffs(30, 3).addBox(5.0F, -9.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Teeth_Bottom.texOffs(12, 36).addBox(4.0F, -9.0F, 1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        Tounge = new ModelRenderer(this);
        Tounge.setPos(0.0F, -1.4883F, 2.5893F);
        Bottom.addChild(Tounge);


        Tounge2 = new ModelRenderer(this);
        Tounge2.setPos(0.0F, -1.0F, 5.0F);
        Tounge.addChild(Tounge2);


        tounge_2_r1 = new ModelRenderer(this);
        tounge_2_r1.setPos(0.0F, 3.0F, 1.0F);
        Tounge2.addChild(tounge_2_r1);
        setRotationAngle(tounge_2_r1, 0.0436F, 0.0F, 0.0F);
        tounge_2_r1.texOffs(68, 5).addBox(-2.0F, -3.5F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);

        Tounge1 = new ModelRenderer(this);
        Tounge1.setPos(0.0F, -1.0F, 2.0F);
        Tounge.addChild(Tounge1);


        tounge_1_r1 = new ModelRenderer(this);
        tounge_1_r1.setPos(0.0F, 3.0F, -1.0F);
        Tounge1.addChild(tounge_1_r1);
        setRotationAngle(tounge_1_r1, 0.3054F, 0.0F, 0.0F);
        tounge_1_r1.texOffs(22, 60).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);

        Top = new ModelRenderer(this);
        Top.setPos(0.0F, -8.0F, -9.0F);
        Pacman.addChild(Top);
        setRotationAngle(Top, -0.4363F, 0.0F, 3.1416F);
        Top.texOffs(50, 51).addBox(-3.0F, 5.4051F, 5.7163F, 6.0F, 1.0F, 6.0F, 0.0F, false);
        Top.texOffs(0, 0).addBox(-5.0F, -0.5949F, 3.7163F, 10.0F, 6.0F, 10.0F, 0.0F, false);
        Top.texOffs(30, 22).addBox(-7.0F, -1.5949F, 3.7163F, 1.0F, 5.0F, 10.0F, 0.0F, false);
        Top.texOffs(58, 58).addBox(-5.0F, -1.5949F, 1.7163F, 10.0F, 5.0F, 1.0F, 0.0F, false);
        Top.texOffs(56, 36).addBox(-5.0F, -1.5949F, 14.7163F, 10.0F, 5.0F, 1.0F, 0.0F, false);
        Top.texOffs(30, 6).addBox(6.0F, -1.5949F, 3.7163F, 1.0F, 5.0F, 10.0F, 0.0F, false);
        Top.texOffs(42, 0).addBox(-6.0F, -1.5949F, 2.7163F, 12.0F, 6.0F, 2.0F, 0.0F, false);
        Top.texOffs(24, 37).addBox(-6.0F, -1.5949F, 12.7163F, 12.0F, 6.0F, 2.0F, 0.0F, false);
        Top.texOffs(26, 45).addBox(4.0F, -1.5949F, 4.7163F, 2.0F, 6.0F, 8.0F, 0.0F, false);
        Top.texOffs(44, 37).addBox(-6.0F, -1.5949F, 4.7163F, 2.0F, 6.0F, 8.0F, 0.0F, false);
        Top.texOffs(52, 64).addBox(-8.0F, -1.5949F, 5.7163F, 1.0F, 3.0F, 6.0F, 0.0F, false);
        Top.texOffs(64, 10).addBox(7.0F, -1.5949F, 5.7163F, 1.0F, 3.0F, 6.0F, 0.0F, false);
        Top.texOffs(24, 66).addBox(-3.0F, -1.5949F, 0.7163F, 6.0F, 3.0F, 1.0F, 0.0F, false);
        Top.texOffs(42, 65).addBox(-3.0F, -1.5949F, 15.7163F, 6.0F, 3.0F, 1.0F, 0.0F, false);

        Teeth_Top = new ModelRenderer(this);
        Teeth_Top.setPos(0.0F, 6.4051F, 8.7163F);
        Top.addChild(Teeth_Top);
        Teeth_Top.texOffs(30, 0).addBox(2.0F, -9.0F, 4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Teeth_Top.texOffs(0, 22).addBox(-1.0F, -9.0F, 5.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Teeth_Top.texOffs(0, 19).addBox(-4.0F, -9.0F, 4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Teeth_Top.texOffs(0, 16).addBox(-6.0F, -9.0F, 1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Teeth_Top.texOffs(0, 6).addBox(-7.0F, -9.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Teeth_Top.texOffs(0, 3).addBox(5.0F, -9.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Teeth_Top.texOffs(0, 0).addBox(4.0F, -9.0F, 1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        Eyes = new ModelRenderer(this);
        Eyes.setPos(0.0F, 6.4051F, 8.7163F);
        Top.addChild(Eyes);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        Eyes.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.0573F, 0.2106F, 0.2679F);
        cube_r1.texOffs(12, 32).addBox(1.0F, -5.0F, 7.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        Eyes.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0573F, -0.2106F, -0.2679F);
        cube_r2.texOffs(52, 17).addBox(-6.0F, -4.0F, 7.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, 0.0F);
        Eyes.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -2.0508F, 0.0F);
        cube_r3.texOffs(66, 64).addBox(7.0F, -7.0F, 0.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, 0.0F, 0.0F);
        Eyes.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 2.0508F, 0.0F);
        cube_r4.texOffs(0, 67).addBox(-9.0F, -7.0F, 0.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Pacman.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;

    }

    private static final ResourceLocation modelResource = new ResourceLocation(GeckoLib.ModID, "geo/giant_pacman_new.geo.json");
    private static final ResourceLocation textureResource = new ResourceLocation(GeckoLib.ModID, "textures/entity/pacman_texture_redesign.png");
    private static final ResourceLocation animationResource = new ResourceLocation(GeckoLib.ModID, "animations/pac_chomp.animation.json");

    @Override
    public void prepareMobModel(Entity pEntity, float pLimbSwing, float pLimbSwingAmount, float pPartialTick) {
        super.prepareMobModel(pEntity, pLimbSwing, pLimbSwingAmount, pPartialTick);
    }

    //@Override
    //public ResourceLocation getModelLocation(GiantPacmanEntity object) {
    //return modelResource;
    //}

    @Override
    public void copyPropertiesTo(EntityModel<Entity> p_217111_1_) {
        super.copyPropertiesTo(p_217111_1_);
    }

    //@Override
    //public ResourceLocation getTextureLocation(GiantPacmanEntity object) {
    //return textureResource;
    //}

    @Override
    public void accept(ModelRenderer p_accept_1_) {
        super.accept(p_accept_1_);
    }


    //@Override
    //public ResourceLocation getAnimationLocation(GiantPacmanEntity object) {
    //return animationResource;
    //}*/


    /**
     * This resource location needs to point to a json file of your animation file,
     * i.e. "geckolib:animations/frog_animation.json"
     *
     * @param animatable
     * @return the animation file location
     */
}