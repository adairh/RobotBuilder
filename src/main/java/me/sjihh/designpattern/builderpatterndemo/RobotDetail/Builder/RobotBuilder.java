package me.sjihh.designpattern.builderpatterndemo.RobotDetail.Builder;

import me.sjihh.designpattern.builderpatterndemo.HelloApplication;
import me.sjihh.designpattern.builderpatterndemo.RobotDetail.Part.Parts.*;

public abstract class RobotBuilder implements IBuilder{

    public String quickView;

    private String headPath;
    private String chestPath;
    private String llPath;
    private String rlPath;
    private String laPath;
    private String raPath;
    private String buildDonePath;
    private String donePath;
    
    private static final int loop = 2;

    public RobotBuilder() {    }

    public boolean buildLLeg() {
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation(llPath, 2);
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Building Left Leg ...");
        return false;
    }
    public boolean buildRLeg() {
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation(rlPath, 2);
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Building Right Leg ...");
        return false;
    }
    public boolean buildLArm() {
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation(laPath, 2);
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Building Left Arm ...");
        return false;
    }
    public boolean buildRArm() {
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation(raPath, 2);
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Building Right Arm ...");
        return false;
    }
    public boolean buildChest() {
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation(chestPath, 2);
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Building Chest ...");
        return false;
    }
    public boolean buildHead() {
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation(headPath, 2);
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Building Head ...");
        return false;
    }
    public boolean buildDone() {
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation(buildDonePath, 2);
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Completing ...");
        return false;
    }
    public boolean done() {
        HelloApplication.getApplication().getSpriteAnimationController().runAnimation(donePath);
        HelloApplication.getApplication().getSpriteAnimationController().updateLabel("Done!!!");
        return false;
    }

    public void init(String qv, String ll, String rl, String la, String ra, String ch, String he, String dn, String fn) {
        this.quickView = qv;
        this.llPath = ll;
        this.rlPath = rl;
        this.laPath = la;
        this.raPath = ra;
        this.chestPath = ch;
        this.headPath = he;
        this.buildDonePath = dn;
        this.donePath = fn;
    }
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



    @Override
    public String quickView() {
        return quickView;
    }

    @Override
    public String pathLLeg() {
        return llPath;
    }

    @Override
    public String pathRLeg() {
        return rlPath;
    }

    @Override
    public String pathLArm() {
        return laPath;
    }

    @Override
    public String pathRArm() {
        return raPath;
    }

    @Override
    public String pathChest() {
        return chestPath;
    }

    @Override
    public String pathHead() {
        return headPath;
    }

    @Override
    public String pathDone() {
        return buildDonePath;
    }

    @Override
    public String fina() {
        return donePath;
    }





}
