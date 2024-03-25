module me.sjihh.designpattern.builderpatterndemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens me.sjihh.designpattern.builderpatterndemo to javafx.fxml;
    exports me.sjihh.designpattern.builderpatterndemo;
    exports me.sjihh.designpattern.builderpatterndemo.RobotDetail;
    opens me.sjihh.designpattern.builderpatterndemo.RobotDetail to javafx.fxml;
    exports me.sjihh.designpattern.builderpatterndemo.RobotDetail.Builder;
    opens me.sjihh.designpattern.builderpatterndemo.RobotDetail.Builder to javafx.fxml;
    exports me.sjihh.designpattern.builderpatterndemo.RobotDetail.Part;
    opens me.sjihh.designpattern.builderpatterndemo.RobotDetail.Part to javafx.fxml;
}