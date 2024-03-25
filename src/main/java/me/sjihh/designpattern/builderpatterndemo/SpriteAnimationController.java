package me.sjihh.designpattern.builderpatterndemo;

import javafx.animation.Animation;
import javafx.animation.SequentialTransition;
import javafx.animation.Transition;
import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import me.sjihh.designpattern.builderpatterndemo.RobotDetail.Builder.BlueBuilder;
import me.sjihh.designpattern.builderpatterndemo.RobotDetail.Builder.OctBuilder;
import me.sjihh.designpattern.builderpatterndemo.RobotDetail.Builder.RobotBuilder;

public class SpriteAnimationController {

    private byte state = 0;

    @FXML
    private ImageView animationView;
    @FXML
    private ImageView quickView;

    @FXML
    private Button robotA;
    @FXML
    private Button robotB;
    @FXML
    private Button build;
    @FXML
    private Label processLabel;

    @FXML
    protected void onRobotAButtonClick() {
        state = 1;
        quickView.setImage(new Image(getClass().getResourceAsStream(BlueBuilder.quickView)));
    }
    @FXML
    protected void onRobotBButtonClick() {
        state = 0;
        quickView.setImage(new Image(getClass().getResourceAsStream(OctBuilder.quickView)));
    }

    RobotBuilder builder;
    SequentialTransition spriteAnimation;

    @FXML
    protected void onRobotBuildButtonClick() {
        System.out.println(state);
        if (state == 1) {
            builder = new BlueBuilder();
        } else {
            builder = new OctBuilder();
        }
    }


    public SpriteAnimationController() {
        System.out.println("Controller instance created");
    }

    @FXML
    private void initialize() {
        System.out.println("Initialize method called");
        if (animationView == null) {
            System.out.println("animationView is null");
        } else {
            System.out.println("animationView is not null");
            quickView.setImage(new Image(getClass().getResourceAsStream(OctBuilder.quickView)));
        }
    }

    public void updateLabel(String s) {
        processLabel.setText(s);
    }

    public void runAnimation(String path) {
        if (spriteAnimation != null) {
            spriteAnimation.stop();
        }
        runAnimation(path, Animation.INDEFINITE);
    }
    public void runAnimation(String path, int loop) {
        int numFrames = 24; // Replace with the actual number of frames
        Image[] frames = new Image[numFrames];

        for (int i = 0; i < numFrames; i++) {
            String s = (i<10?"0":"") + i;
            //blue_sprite/blue__
            String frameFilename = path + s+ ".png";
            frames[i] = new Image(getClass().getResourceAsStream(frameFilename));
        }

        Transition spriteAnimationTransition = new Transition() {
            {
                setCycleDuration(Duration.millis(1000));
                setCycleCount(loop);
            }

            @Override
            protected void interpolate(double frac) {
                int index = Math.min((int) Math.floor(frac * frames.length), frames.length - 1);
                animationView.setViewport(new Rectangle2D(0, 0, frames[index].getWidth(), frames[index].getHeight()));
                animationView.setImage(frames[index]);
            }
        };

        spriteAnimation = new SequentialTransition(spriteAnimationTransition);
        spriteAnimation.setOnFinished(e -> {
            System.out.println("Done");
            builder.doTask();
        });
        spriteAnimation.play();
    }



}