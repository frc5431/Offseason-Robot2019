package frc.robot.components;

import frc.team5431.titan.core.joysticks.Xbox;
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
        ledState = LEDState.OFF;
    }

    @Override
    public void tick(Robot robot) {
        final NetworkTable selectedTable = getSelectedTable();
        final Xbox controller = robot.getTeleop().getDriver();

        if(controller.getRawButton(Xbox.Button.X)){
            selectedTable.getEntry("ledMode").setNumber(2);
        } else {
            //selectedTable.getEntry("ledMode").setNumber(ledState == LEDState.ON || controller.getRawButton(Xbox.Button.A) || robot.getAuton().getCurrentSequenceType() == SequenceType.HATCH ? 3 : 1);
            selectedTable.getEntry("ledMode").setNumber(ledState == LEDState.ON || controller.getRawButton(Xbox.Button.A) ? 3 : 1);
        }
    }

    /**
     * @return the ledState
     */
    public LEDState getLedState() {
        return ledState;
    }

    /**
     * @param ledState the ledState to set
     */
    public void setLedState(LEDState ledState) {
        this.ledState = ledState;
    }

    /**
     * @return the table
     */
    public NetworkTable getSelectedTable() {
        return table;
    }
}