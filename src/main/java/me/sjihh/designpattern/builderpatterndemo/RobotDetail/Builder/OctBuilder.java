package me.sjihh.designpattern.builderpatterndemo.RobotDetail.Builder;

import me.sjihh.designpattern.builderpatterndemo.HelloApplication;
import me.sjihh.designpattern.builderpatterndemo.RobotDetail.Part.Parts.*;
import me.sjihh.designpattern.builderpatterndemo.RobotDetail.Robot;

public class OctBuilder extends RobotBuilder {

    public static final String quickView = "oct_sprite/oct_00.png";

    private static final String headPath = "oct_sprite/he/oct_";
    private static final String chestPath = "oct_sprite/ch/oct_";
    private static final String llPath = "oct_sprite/ll/oct_";
    private static final String rlPath = "oct_sprite/rl/oct_";
    private static final String laPath = "oct_sprite/la/oct_";
    private static final String raPath = "oct_sprite/ra/oct_";

    public OctBuilder() {
        Head head = new Head(headPath);
        Body body = new Body(chestPath);
        LeftLeg leftLeg = new LeftLeg(llPath);
        RightLeg rightLeg = new RightLeg(rlPath);
        LeftArm leftArm = new LeftArm(laPath);
        RightArm rightArm = new RightArm(raPath);
        Robot robot = new Robot(head, body, leftLeg, rightLeg, leftArm, rightArm);
        doTask();
    }

    @Override
    public boolean buildLLeg() {
        System.out.println("AA");
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation(llPath, 3);
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Building Left Leg ...");
        return false;
    }

    @Override
    public boolean buildRLeg() {
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation(rlPath, 3);
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Building Right Leg ...");
        return false;
    }

    @Override
    public boolean buildLArm() {
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation(laPath, 3);
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Building Left Arm ...");
        return false;
    }

    @Override
    public boolean buildRArm() {
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation(raPath, 3);
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Building Right Arm ...");
        return false;
    }

    @Override
    public boolean buildChest() {
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation(chestPath, 3);
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Building Chest ...");
        return false;
    }

    @Override
    public boolean buildHead() {
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation(headPath, 3);
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Building Head ...");
        return false;
    }

    @Override
    public boolean buildDone() {
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation("oct_sprite/dn/oct_", 3);
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Completing ...");
        return false;
    }
    @Override
    public boolean done() {
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation("oct_sprite/oct_");
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Done!!!");
        return false;
    }
}
