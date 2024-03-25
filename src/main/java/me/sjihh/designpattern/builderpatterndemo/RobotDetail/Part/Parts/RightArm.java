package me.sjihh.designpattern.builderpatterndemo.RobotDetail.Part.Parts;

import me.sjihh.designpattern.builderpatterndemo.RobotDetail.Part.EPart;
import me.sjihh.designpattern.builderpatterndemo.RobotDetail.Part.IRobotPart;
import me.sjihh.designpattern.builderpatterndemo.RobotDetail.Part.Part;

public class RightArm extends Part implements IRobotPart {
    String path;

    public RightArm(String path) {
        super(path);
        this.path = path;
    }

    @Override
    public EPart type() {
        return EPart.R_ARM;
    }

    @Override
    public String img() {
        return path;
    }
}
