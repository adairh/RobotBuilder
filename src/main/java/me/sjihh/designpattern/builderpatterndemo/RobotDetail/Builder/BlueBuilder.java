package me.sjihh.designpattern.builderpatterndemo.RobotDetail.Builder;

import me.sjihh.designpattern.builderpatterndemo.HelloApplication;
import me.sjihh.designpattern.builderpatterndemo.RobotDetail.Part.Parts.*;
import me.sjihh.designpattern.builderpatterndemo.RobotDetail.Robot;

public class BlueBuilder extends RobotBuilder implements IBuilder{

    public static final String quickView = "blue_sprite/blue__00.png";
    private static final String headPath = "blue_sprite/he/blue__";
    private static final String chestPath = "blue_sprite/ch/blue__";
    private static final String llPath = "blue_sprite/ll/blue__";
    private static final String rlPath = "blue_sprite/rl/blue__";
    private static final String laPath = "blue_sprite/la/blue__";
    private static final String raPath = "blue_sprite/ra/blue__";
    private static final String buildDone = "blue_sprite/dn/blue__";
    private static final String fn = "blue_sprite/blue__";

    public BlueBuilder() {
        Head head = new Head(headPath);
        Body body = new Body(chestPath);
        LeftLeg leftLeg = new LeftLeg(llPath);
        RightLeg rightLeg = new RightLeg(rlPath);
        LeftArm leftArm = new LeftArm(laPath);
        RightArm rightArm = new RightArm(raPath);
        Robot robot = new Robot(head, body, leftLeg, rightLeg, leftArm, rightArm);
        init(quickView, llPath,rlPath, laPath, raPath, chestPath, headPath, buildDone, fn);
        doTask();
    }

    @Override
    public void init(String qv, String ll, String rl, String la, String ra, String ch, String he, String dn, String fn) {
        super.init(qv, ll, rl, la, ra, ch, he, dn, fn);
    }

    @Override
    public String builderName() {
        return "BlueBuilder";
    }
}
