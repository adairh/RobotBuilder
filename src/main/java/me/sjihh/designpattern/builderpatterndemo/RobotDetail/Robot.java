package me.sjihh.designpattern.builderpatterndemo.RobotDetail;

import me.sjihh.designpattern.builderpatterndemo.RobotDetail.Part.Parts.*;

public class Robot {
    private Head head;
    private Body body;
    private RightArm rightArm;

    private LeftArm leftArm;
    private RightLeg rightLeg;
    private LeftLeg leftLeg;

    public Robot(Head head, Body body, LeftLeg leftLeg, RightLeg rightLeg, LeftArm leftArm, RightArm rightArm) {
        this.head = head;
        this.body = body;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
    }



}
