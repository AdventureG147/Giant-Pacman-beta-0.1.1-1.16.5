package net.adventureg147.giantpacman.entity.model;// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.adventureg147.giantpacman.entity.custom.GiantPacmanEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.GeoModelProvider;

public class GiantPacmanModel extends AnimatedGeoModel {
	private static final ResourceLocation modelResource = new ResourceLocation(GeckoLib.ModID, "geo/giant_pacman.geo.json");
	private static final ResourceLocation textureResource = new ResourceLocation(GeckoLib.ModID, "textures/entity/pacman_texture.png");
	private static final ResourceLocation animationResource = new ResourceLocation(GeckoLib.ModID, "animations/pac_chomp.animation.json");

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
