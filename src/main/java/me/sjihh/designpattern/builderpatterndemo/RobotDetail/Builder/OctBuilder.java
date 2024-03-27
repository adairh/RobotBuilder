package me.sjihh.designpattern.builderpatterndemo.RobotDetail.Builder;

import me.sjihh.designpattern.builderpatterndemo.HelloApplication;
import me.sjihh.designpattern.builderpatterndemo.RobotDetail.Part.Parts.*;
import me.sjihh.designpattern.builderpatterndemo.RobotDetail.Robot;

public class OctBuilder extends RobotBuilder implements IBuilder {

    public static final String quickView = "oct_sprite/oct_00.png";
    private static final String headPath = "oct_sprite/he/oct_";
    private static final String chestPath = "oct_sprite/ch/oct_";
    private static final String llPath = "oct_sprite/ll/oct_";
    private static final String rlPath = "oct_sprite/rl/oct_";
    private static final String laPath = "oct_sprite/la/oct_";
    private static final String raPath = "oct_sprite/ra/oct_";
    private static final String buildDone = "oct_sprite/dn/oct_";
    private static final String fn = "oct_sprite/oct_";

    public OctBuilder() {
        Head head = new Head(headPath);
        Body body = new Body(chestPath);
        LeftLeg leftLeg = new LeftLeg(llPath);
        RightLeg rightLeg = new RightLeg(rlPath);
        LeftArm leftArm = new LeftArm(laPath);
        RightArm rightArm = new RightArm(raPath);
        Robot robot = new Robot(head, body, leftLeg, rightLeg, leftArm, rightArm);

        //do something with robot later here

        init(quickView, llPath,rlPath, laPath, raPath, chestPath, headPath, buildDone, fn);
        doTask();
    }

    @Override
    public void init(String qv, String ll, String rl, String la, String ra, String ch, String he, String dn, String fn) {
        super.init(qv, ll, rl, la, ra, ch, he, dn, fn);
    }


    @Override
    public String builderName() {
        return "OctBuilder";
    }

}
