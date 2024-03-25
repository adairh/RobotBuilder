package me.sjihh.designpattern.builderpatterndemo.RobotDetail.Part;

public enum EPart {
    HEAD("head"),
    BODY("body"),
    R_ARM("right_arm"),
    L_ARM("left_arm"),
    R_LEG("right_leg"),
    L_LEG("left_leg");

    String name;
    EPart(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
