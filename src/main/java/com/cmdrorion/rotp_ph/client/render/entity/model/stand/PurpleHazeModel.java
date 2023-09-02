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
	private final ModelRenderer head;
	private final ModelRenderer Hat;
	private final ModelRenderer body;
	private final ModelRenderer bodyParts;
	private final ModelRenderer rightArm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightForeArm;
	private final ModelRenderer foreArmPart2;
	private final ModelRenderer leftForeArm;
	private final ModelRenderer foreArmPart;
	private final ModelRenderer leftLowerLeg;
	private final ModelRenderer rightLowerLeg;

	public PurpleHazeModel() {
		super();
		
		addHumanoidBaseBoxes(null);
		texWidth = 128;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.texOffs(33, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		Hat = new ModelRenderer(this);
		Hat.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(Hat);
		Hat.texOffs(92, 89).addBox(-1.1F, -8.9F, -4.9F, 2.2F, 5.9F, 8.9F, 0.0F, false);
		Hat.texOffs(92, 89).addBox(-2.2F, -8.9F, -4.9F, 1.2F, 4.9F, 8.9F, 0.0F, false);
		Hat.texOffs(92, 89).addBox(-4.2F, -8.1F, -4.9F, 3.2F, 3.1F, 8.9F, 0.0F, false);
		Hat.texOffs(92, 89).addBox(1.8F, -8.1F, -4.9F, 3.2F, 3.1F, 8.9F, 0.0F, false);
		Hat.texOffs(92, 89).addBox(1.0F, -8.9F, -4.9F, 1.4F, 4.9F, 8.9F, 0.0F, false);
		Hat.texOffs(79, 85).addBox(-4.4F, -8.5F, -4.9F, 9.4F, 0.5F, 8.9F, 0.0F, false);
		Hat.texOffs(79, 85).addBox(-3.4F, -8.7F, -4.9F, 7.4F, 0.7F, 8.9F, 0.0F, false);
		Hat.texOffs(91, 88).addBox(4.6F, -8.5F, -4.9F, 0.4F, 3.5F, 9.1F, 0.0F, false);
		Hat.texOffs(98, 95).addBox(2.6F, -8.5F, 2.1F, 2.4F, 6.6F, 2.2F, 0.0F, false);
		Hat.texOffs(99, 96).addBox(2.6F, -2.5F, 3.1F, 2.4F, 1.3F, 1.2F, 0.0F, false);
		Hat.texOffs(91, 88).addBox(-4.8F, -8.5F, -4.9F, 0.8F, 3.5F, 9.4F, 0.0F, false);
		Hat.texOffs(98, 95).addBox(-4.8F, -5.5F, 2.0F, 1.8F, 3.5F, 2.5F, 0.0F, false);
		Hat.texOffs(99, 96).addBox(-4.8F, -2.5F, 3.0F, 1.8F, 1.5F, 1.5F, 0.0F, false);
		Hat.texOffs(98, 95).addBox(-4.4F, -8.5F, 2.1F, 0.4F, 3.5F, 2.4F, 0.0F, false);
		Hat.texOffs(87, 93).addBox(-4.1F, -8.5F, 4.1F, 8.0F, 8.3F, 0.7F, 0.0F, false);
		Hat.texOffs(87, 93).addBox(-4.1F, -8.5F, 4.1F, 8.9F, 7.8F, 0.7F, 0.0F, false);
		Hat.texOffs(31, 102).addBox(-2.0F, -10.8F, -1.5F, 4.0F, 2.2F, 5.5F, 0.0F, false);
		Hat.texOffs(31, 102).addBox(-1.4F, -12.1F, -2.8F, 2.9F, 1.6F, 5.2F, 0.0F, false);
		Hat.texOffs(31, 102).addBox(-1.0F, -13.1F, -4.8F, 2.0F, 1.2F, 5.2F, 0.0F, false);
		Hat.texOffs(0, 0).addBox(-5.0F, -5.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		Hat.texOffs(1, 1).addBox(-5.0F, -4.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Hat.texOffs(1, 1).addBox(-5.0F, -4.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Hat.texOffs(1, 1).addBox(4.0F, -4.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Hat.texOffs(0, 0).addBox(4.0F, -5.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		Hat.texOffs(1, 1).addBox(4.0F, -4.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Hat.texOffs(0, 0).addBox(-5.0F, -5.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Hat.texOffs(0, 0).addBox(-5.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		body.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		bodyParts = new ModelRenderer(this);
		bodyParts.setPos(0.0F, 24.0F, 0.0F);
		body.addChild(bodyParts);
		bodyParts.texOffs(91, 34).addBox(2.0F, -21.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bodyParts.texOffs(89, 32).addBox(2.6F, -20.6F, 1.0F, 1.0F, 1.1F, 4.0F, 0.0F, false);
		bodyParts.texOffs(89, 32).addBox(-0.4F, -20.6F, 1.0F, 1.0F, 1.1F, 4.0F, 0.0F, false);
		bodyParts.texOffs(91, 34).addBox(-1.0F, -21.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bodyParts.texOffs(89, 32).addBox(-3.4F, -20.6F, 1.0F, 1.0F, 1.1F, 4.0F, 0.0F, false);
		bodyParts.texOffs(91, 34).addBox(-4.0F, -21.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, 2.0F, 0.0F);
		rightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		rightArm.texOffs(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(3.1F, 10.0F, 0.0F);
		rightArm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 3.1416F, 0.0F);
		cube_r1.texOffs(58, 83).addBox(-7.0F, -11.9F, -2.3F, 1.2F, 2.9F, 1.5F, 0.0F, false);
		cube_r1.texOffs(59, 84).addBox(-10.0F, -10.2F, -2.3F, 4.2F, 1.2F, 0.5F, 0.0F, false);
		cube_r1.texOffs(55, 80).addBox(-10.6F, -10.2F, -2.3F, 1.6F, 1.2F, 4.6F, 0.0F, false);
		cube_r1.texOffs(59, 84).addBox(-10.3F, -10.2F, 1.7F, 4.3F, 1.2F, 0.6F, 0.0F, false);
		cube_r1.texOffs(58, 83).addBox(-7.0F, -11.9F, 0.7F, 1.0F, 2.9F, 1.6F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, 2.0F, 0.0F);
		leftArm.texOffs(16, 77).addBox(-13.5F, -0.2F, -2.3F, 1.6F, 1.2F, 4.6F, 0.0F, false);
		leftArm.texOffs(20, 81).addBox(-12.9F, -0.2F, -2.3F, 4.2F, 1.2F, 0.5F, 0.0F, false);
		leftArm.texOffs(19, 80).addBox(-9.9F, -1.9F, -2.3F, 1.2F, 2.9F, 1.5F, 0.0F, false);
		leftArm.texOffs(20, 81).addBox(-13.2F, -0.2F, 1.7F, 4.3F, 1.2F, 0.6F, 0.0F, false);
		leftArm.texOffs(19, 80).addBox(-9.9F, -1.9F, 0.7F, 1.0F, 2.9F, 1.6F, 0.0F, false);
		leftArm.texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		leftArm.texOffs(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.9F, 12.0F, 0.0F);
		rightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		rightLeg.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setPos(1.9F, 12.0F, 0.0F);
		leftleg.texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		leftleg.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);

		rightForeArm = new ModelRenderer(this);
		rightForeArm.setPos(-1.9F, 12.0F, 0.0F);
		rightForeArm.texOffs(40, 22).addBox(-6.1F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		rightForeArm.texOffs(40, 38).addBox(-6.1F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);

		foreArmPart2 = new ModelRenderer(this);
		foreArmPart2.setPos(-3.1F, -10.0F, 0.0F);
		rightForeArm.addChild(foreArmPart2);
		foreArmPart2.texOffs(37, 83).addBox(-4.0F, 8.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		foreArmPart2.texOffs(37, 83).addBox(-4.0F, 8.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		foreArmPart2.texOffs(36, 82).addBox(-4.0F, 8.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		foreArmPart2.texOffs(37, 83).addBox(-4.0F, 8.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftForeArm = new ModelRenderer(this);
		leftForeArm.setPos(0.0F, 24.0F, 0.0F);
		leftForeArm.texOffs(32, 54).addBox(4.0F, -18.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		leftForeArm.texOffs(48, 54).addBox(4.0F, -18.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);

		foreArmPart = new ModelRenderer(this);
		foreArmPart.setPos(-5.0F, -22.0F, 0.0F);
		leftForeArm.addChild(foreArmPart);
		foreArmPart.texOffs(37, 83).addBox(13.0F, 8.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		foreArmPart.texOffs(37, 83).addBox(13.0F, 8.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		foreArmPart.texOffs(36, 82).addBox(13.0F, 8.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		foreArmPart.texOffs(37, 83).addBox(13.0F, 8.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftLowerLeg = new ModelRenderer(this);
		leftLowerLeg.setPos(0.0F, 24.0F, 0.0F);
		leftLowerLeg.texOffs(0, 54).addBox(-0.1F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		leftLowerLeg.texOffs(16, 54).addBox(-0.1F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		rightLowerLeg = new ModelRenderer(this);
		rightLowerLeg.setPos(0.0F, 24.0F, 0.0F);
		rightLowerLeg.texOffs(0, 54).addBox(-3.9F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		rightLowerLeg.texOffs(0, 22).addBox(-3.9F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
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