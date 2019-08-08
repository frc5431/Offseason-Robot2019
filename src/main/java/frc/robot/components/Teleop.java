package frc.robot.components;

import frc.robot.Constants;
import frc.robot.Robot;
import frc.team5431.titan.core.joysticks.*;
import frc.robot.components.*;

public class Teleop {
    private Xbox driver;
    private LogitechExtreme3D operator;


    public Teleop(){
        driver = new Xbox(Constants.DRIVER_JOYSTICK_ID);
        driver.setDeadzone(Constants.DRIVER_JOYSTICK_DEADZONE);

        operator = new LogitechExtreme3D(Constants.OPERATOR_JOYSTICK_ID);
        operator.setDeadzone(Constants.OPERATOR_JOYSTICK_DEADZONE);

    }

}