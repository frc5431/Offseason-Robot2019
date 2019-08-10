package frc.robot.components;

import frc.robot.Constants;
import frc.robot.Robot;
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

        drivebase.drive(driver.getRawAxis(Xbox.Axis.LEFT_Y), driver.getRawAxis(Xbox.Axis.RIGHT_Y));

    }

    @Override
    public void disabled(Robot robot) {

    }

}