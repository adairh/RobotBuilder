package me.sjihh.designpattern.builderpatterndemo.RobotDetail.Builder;

public interface IBuilder {
    String builderName();
    String quickView();
    String pathLLeg();
    String pathRLeg();
    String pathLArm();
    String pathRArm();
    String pathChest();
    String pathHead();
    String pathDone();
    String fina();
}
