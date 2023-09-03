package com.cmdrorion.rotp_ph.client.render.entity.model.stand;

import com.cmdrorion.rotp_ph.entity.stand.stands.PurpleHaze_Entity;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.client.render.entity.model.stand.HumanoidStandModel;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPose;
import com.github.standobyte.jojo.client.render.entity.pose.RotationAngle;
import com.github.standobyte.jojo.client.render.entity.pose.anim.PosedActionAnimation;
import com.github.standobyte.jojo.entity.stand.StandPose;

import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class PurpleHazeModel extends HumanoidStandModel<PurpleHaze_Entity> {
    private final ModelRenderer Hat;
    private final ModelRenderer torso;
    private final ModelRenderer torso_r1;
    private final ModelRenderer torso_r2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;

	public PurpleHazeModel() {
		super();
		
		addHumanoidBaseBoxes(null);
		texWidth = 128;
		texHeight = 128;


		Hat = new ModelRenderer(this);
		Hat.setPos(-0.1F, 0.0F, 0.0F);
		head.addChild(Hat);
		Hat.texOffs(57, 5).addBox(-1.1F, -8.9F, -4.9F, 2.2F, 5.9F, 8.9F, 0.0F, false);
		Hat.texOffs(9, 37).addBox(-4.1F, -6.9F, -4.5F, 8.2F, 4.9F, 0.1F, 0.0F, false);
		Hat.texOffs(9, 37).addBox(-3.1F, -2.2F, -4.5F, 6.2F, 1.2F, 0.1F, 0.0F, false);
		Hat.texOffs(9, 37).addBox(-1.1F, -1.2F, -4.5F, 2.2F, 1.2F, 0.1F, 0.0F, false);
		Hat.texOffs(57, 5).addBox(-2.2F, -8.9F, -4.9F, 1.2F, 4.9F, 8.9F, 0.0F, false);
		Hat.texOffs(57, 5).addBox(-4.2F, -8.1F, -4.9F, 3.2F, 3.1F, 8.9F, 0.0F, false);
		Hat.texOffs(57, 5).addBox(1.8F, -8.1F, -4.9F, 3.2F, 3.1F, 8.9F, 0.0F, false);
		Hat.texOffs(57, 5).addBox(1.0F, -8.9F, -4.9F, 1.4F, 4.9F, 8.9F, 0.0F, false);
		Hat.texOffs(44, 1).addBox(-4.4F, -8.5F, -4.9F, 9.4F, 0.5F, 8.9F, 0.0F, false);
		Hat.texOffs(44, 1).addBox(-3.4F, -8.7F, -4.9F, 7.4F, 0.7F, 8.9F, 0.0F, false);
		Hat.texOffs(56, 4).addBox(4.6F, -8.5F, -4.9F, 0.4F, 3.5F, 9.1F, 0.0F, false);
		Hat.texOffs(63, 11).addBox(2.6F, -8.5F, 2.1F, 2.4F, 6.6F, 2.2F, 0.0F, false);
		Hat.texOffs(64, 12).addBox(2.6F, -2.5F, 3.1F, 2.4F, 1.3F, 1.2F, 0.0F, false);
		Hat.texOffs(56, 4).addBox(-4.8F, -8.5F, -4.9F, 0.8F, 3.5F, 9.4F, 0.0F, false);
		Hat.texOffs(63, 11).addBox(-4.8F, -5.5F, 2.0F, 1.8F, 3.5F, 2.5F, 0.0F, false);
		Hat.texOffs(64, 12).addBox(-4.8F, -2.5F, 3.0F, 1.8F, 1.5F, 1.5F, 0.0F, false);
		Hat.texOffs(63, 11).addBox(-4.4F, -8.5F, 2.1F, 0.4F, 3.5F, 2.4F, 0.0F, false);
		Hat.texOffs(52, 9).addBox(-4.1F, -8.5F, 4.1F, 8.0F, 8.3F, 0.7F, 0.0F, false);
		Hat.texOffs(52, 9).addBox(-4.1F, -8.5F, 4.1F, 8.9F, 7.8F, 0.7F, 0.0F, false);
		Hat.texOffs(62, 0).addBox(-2.0F, -10.8F, -1.5F, 4.0F, 2.2F, 5.5F, 0.0F, false);
		Hat.texOffs(62, 0).addBox(-1.4F, -12.1F, -2.8F, 2.9F, 1.6F, 5.2F, 0.0F, false);
		Hat.texOffs(62, 0).addBox(-1.0F, -13.1F, -4.8F, 2.0F, 1.2F, 5.2F, 0.0F, false);


		torso = new ModelRenderer(this);
		torso.setPos(0.0F, -12.0F, 0.0F);
		upperPart.addChild(torso);
		torso.texOffs(0, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		torso.texOffs(20, 64).addBox(-3.5F, 1.1F, -2.0F, 7.0F, 3.0F, 1.0F, 0.4F, false);
		torso.texOffs(24, 73).addBox(-2.5F, 4.0F, -2.3F, 5.0F, 6.0F, 1.0F, 0.0F, false);
		torso.texOffs(91, 34).addBox(2.0F, 3.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		torso.texOffs(89, 32).addBox(2.6F, 3.4F, 1.0F, 1.0F, 1.1F, 4.0F, 0.0F, false);
		torso.texOffs(89, 32).addBox(-0.4F, 3.4F, 1.0F, 1.0F, 1.1F, 4.0F, 0.0F, false);
		torso.texOffs(91, 34).addBox(-1.0F, 3.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		torso.texOffs(89, 32).addBox(-3.4F, 3.4F, 1.0F, 1.0F, 1.1F, 4.0F, 0.0F, false);
		torso.texOffs(91, 34).addBox(-4.0F, 3.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		torso.texOffs(47, 81).addBox(-4.0F, 4.0F, 1.8F, 8.0F, 15.0F, 0.5F, 0.0F, false);
		torso.texOffs(52, 10).addBox(-1.45F, 10.65F, -2.55F, 2.9F, 3.2F, 4.0F, 0.15F, true);

		torso_r1 = new ModelRenderer(this);
		torso_r1.setPos(-5.9F, 21.85F, 0.0F);
		leftArm.addChild(torso_r1);
		setRotationAngle(torso_r1, 0.0F, 0.0F, 0.0873F);
		torso_r1.texOffs(23, 23).addBox(1.25F, -24.3F, -2.55F, 0.9F, 1.4F, 5.1F, 0.15F, true);
		torso_r1.texOffs(23, 23).addBox(1.25F, -22.6F, -2.55F, 4.9F, 1.0F, 5.1F, 0.15F, true);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-6.0F, 22.0F, 0.0F);
		leftArm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.texOffs(89, 32).addBox(-0.4F, -19.6F, 7.0F, 1.0F, 1.1F, 4.0F, 0.0F, false);
		cube_r1.texOffs(91, 34).addBox(-1.0F, -20.0F, 7.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		torso_r2 = new ModelRenderer(this);
		torso_r2.setPos(6.1F, 21.85F, 0.0F);
		rightArm.addChild(torso_r2);
		setRotationAngle(torso_r2, 3.1416F, 0.0F, 3.0543F);
		torso_r2.texOffs(23, 23).addBox(1.65F, -24.3F, -2.55F, 0.9F, 1.4F, 5.1F, 0.15F, true);
		torso_r2.texOffs(23, 23).addBox(1.65F, -22.6F, -2.55F, 4.9F, 1.0F, 5.1F, 0.15F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(6.0F, 22.0F, 0.0F);
		rightArm.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.texOffs(91, 34).addBox(-1.0F, -20.0F, 7.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r2.texOffs(89, 32).addBox(-0.4F, -19.6F, 7.0F, 1.0F, 1.1F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-1.9F, 12.0F, 0.0F);
		leftLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 3.1416F, 0.0F);
		cube_r3.texOffs(91, 34).addBox(-3.0F, -10.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r3.texOffs(89, 32).addBox(-2.4F, -9.6F, 1.0F, 1.0F, 1.1F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(1.9F, 12.0F, 0.0F);
		rightLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 3.1416F, 0.0F);
		cube_r4.texOffs(91, 34).addBox(1.0F, -10.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r4.texOffs(89, 32).addBox(1.6F, -9.6F, 1.0F, 1.0F, 1.1F, 4.0F, 0.0F, false);

	}


@Override
	protected RotationAngle[][] initSummonPoseRotations() {
		return new RotationAngle[][] {
				new RotationAngle[] {
						RotationAngle.fromDegrees(head, 0, -15F, 0),
						RotationAngle.fromDegrees(body, -10F, -10F, 0),
						RotationAngle.fromDegrees(upperPart, 0, 0, 0),
						RotationAngle.fromDegrees(leftArm, 10F, 0, -2.5F),
						RotationAngle.fromDegrees(leftForeArm, -15F, 0, 2.5F),
						RotationAngle.fromDegrees(rightArm, 10F, 0, 2.5F),
						RotationAngle.fromDegrees(rightForeArm, -2.5F, 0, 2.5F),
						RotationAngle.fromDegrees(leftLeg, 7.5F, 0, -5F),
						RotationAngle.fromDegrees(leftLowerLeg, 2.5F, 0, 5F),
						RotationAngle.fromDegrees(rightLeg, 5F, 0, 5F),
						RotationAngle.fromDegrees(rightLowerLeg, 2.5F, 0, -5)
				},
				new RotationAngle[] {
						RotationAngle.fromDegrees(head, 0, 0, 0),
						RotationAngle.fromDegrees(body, 5F, -20F, 0),
						RotationAngle.fromDegrees(upperPart, 0, 0, 0),
						RotationAngle.fromDegrees(leftArm, 0, 0, 0),
						RotationAngle.fromDegrees(leftForeArm, -7.5F, 0, 0),
						RotationAngle.fromDegrees(rightArm, 0, -50F, 20F),
						RotationAngle.fromDegrees(rightForeArm, -40F, 0, 0),
						RotationAngle.fromDegrees(leftLeg, -15F, -15F, 0),
						RotationAngle.fromDegrees(leftLowerLeg, 10F, 0, 0),
						RotationAngle.fromDegrees(rightLeg, -7.5F, 15F, 0),
						RotationAngle.fromDegrees(rightLowerLeg, 2.5F, 0, 0)
				}
		};
	}

	@Override
	protected void initActionPoses() {
        actionAnim.put(StandPose.RANGED_ATTACK, new PosedActionAnimation.Builder<PurpleHaze_Entity>()
                .addPose(StandEntityAction.Phase.BUTTON_HOLD, new ModelPose<>(new RotationAngle[] {
                        new RotationAngle(body, 0.0F, -0.48F, 0.0F),
                        new RotationAngle(leftArm, 0.0F, 0.0F, 0.0F),
                        new RotationAngle(leftForeArm, 0.0F, 0.0F, 0.0F),
                        new RotationAngle(rightArm, -1.0908F, 0.0F, 1.5708F), 
                        new RotationAngle(rightForeArm, 0.0F, 0.0F, 0.0F)
                }))
                .build(idlePose));

		super.initActionPoses();
	}

	@Override
	protected ModelPose<PurpleHaze_Entity> initIdlePose() {
		return new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, -5F, 30F, 0.0F),
				RotationAngle.fromDegrees(upperPart, 0.0F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(torso, 0.0F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(leftArm, 12.5F, -30F, -15F),
				RotationAngle.fromDegrees(leftForeArm, -12.5F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(rightArm, 10F, 30F, 15F),
				RotationAngle.fromDegrees(rightForeArm, -15F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(leftLeg, 20F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(leftLowerLeg, 0.0F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(rightLeg, 0.0F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(rightLowerLeg, 5F, 0.0F, 0.0F)
		});
	}

	@Override
	protected ModelPose<PurpleHaze_Entity> initIdlePose2Loop() {
		return new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(leftArm, 7.5F, -30F, -15F),
				RotationAngle.fromDegrees(leftForeArm, -17.5F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(rightArm, 12.5F, 30F, 15F),
				RotationAngle.fromDegrees(rightForeArm, -17.5F, 0.0F, 0.0F)
		});
	}
}