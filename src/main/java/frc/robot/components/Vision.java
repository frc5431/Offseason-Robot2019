package frc.robot.components;

import frc.team5431.titan.core.robot.Component;
import frc.robot.Robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;


public class Vision extends Component<Robot> {
    public static enum LEDState{
        ON, OFF
    };

    private final NetworkTable table;
    private LEDState ledState = LEDState.OFF;

    public Vision() {
        table = NetworkTableInstance.getDefault().getTable("limelight");
    }
    
    @Override
    public void init(Robot robot) {

    }

    @Override
    public void periodic(Robot robot) {

    }

    @Override
    public void disabled(Robot robot) {

    }

}