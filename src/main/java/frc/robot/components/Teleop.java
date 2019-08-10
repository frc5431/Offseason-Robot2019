package frc.robot.components;

import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.util.ControlMode;
import frc.team5431.titan.core.joysticks.Xbox;
import frc.team5431.titan.core.robot.Component;

public class Teleop extends Component<Robot> {

    private Xbox driver;
    private Xbox operator;

    public Teleop() {
        driver = new Xbox(Constants.DRIVER_JOYSTICK_ID);
        operator = new Xbox(Constants.OPERATOR_JOYSTICK_ID);

        driver.setDeadzone(Constants.DRIVER_JOYSTICK_DEADZONE);
        operator.setDeadzone(Constants.OPERATOR_JOYSTICK_DEADZONE);
    }


    @Override
    public void init(Robot robot) {

    }

    @Override
    public void periodic(Robot robot) {
        final Drivebase drivebase = robot.getDrivebase();
        final Dashboard dashboard = robot.getDashboard();

        double left;
        double right;
        
        if (dashboard.getTankChooser()) {
            left = -driver.getRawAxis(Xbox.Axis.LEFT_Y);
			right = -driver.getRawAxis(Xbox.Axis.RIGHT_Y);
        } else {
            left = -driver.getRawAxis(Xbox.Axis.LEFT_Y)+driver.getRawAxis(Xbox.Axis.LEFT_X)*.5;
            right = -driver.getRawAxis(Xbox.Axis.LEFT_Y)-driver.getRawAxis(Xbox.Axis.LEFT_X)*.5;
        }

        if (drivebase.getControlMode() == ControlMode.MANUAL || left != 0.0 || right != 0.0) { 
            drivebase.drive(left, right);
        }
    }

    @Override
    public void disabled(Robot robot) {

    }

    /**
     * @return the driver
     */
    public Xbox getDriver() {
        return driver;
    }
}