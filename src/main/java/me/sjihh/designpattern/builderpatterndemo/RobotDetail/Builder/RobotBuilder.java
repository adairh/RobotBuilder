package me.sjihh.designpattern.builderpatterndemo.RobotDetail.Builder;

import me.sjihh.designpattern.builderpatterndemo.RobotDetail.Part.Parts.*;

public abstract class RobotBuilder {
    public RobotBuilder() {    }

    public abstract boolean buildLLeg();
    public abstract boolean buildRLeg();
    public abstract boolean buildLArm();
    public abstract boolean buildRArm();
    public abstract boolean buildChest();
    public abstract boolean buildHead();
    public abstract boolean buildDone();
    public abstract boolean done();

    private int task = 0;

    public void doTask() {
        switch (task) {
            case 0:
                buildLLeg();
                break;
            case 1:
                buildRLeg();
                break;
            case 2:
                buildLArm();
                break;
            case 3:
                buildRArm();
                break;
            case 4:
                buildChest();
                break;
            case 5:
                buildHead();
                break;
            case 6:
                buildDone();
                break;
            default:
                done();
                break;
        }
        task++;
    }





}
