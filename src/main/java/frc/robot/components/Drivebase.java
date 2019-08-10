package frc.robot.components;

import frc.robot.Robot;
import frc.robot.util.ControlMode;
import frc.robot.Constants;
import frc.team5431.titan.core.robot.Component;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;;

public class Drivebase extends Component<Robot> {
    private final WPI_VictorSPX frontRight, frontLeft, backRight, backLeft;
    private ControlMode controlMode = ControlMode.MANUAL;

    public Drivebase(){
        frontRight = new WPI_VictorSPX(Constants.FRONT_RIGHT_ID);
        frontRight.setInverted(Constants.FRONT_RIGHT_INVERTED);
        
        frontLeft = new WPI_VictorSPX(Constants.FRONT_LEFT_ID);
        frontLeft.setInverted(Constants.FRONT_LEFT_INVERTED);

        backRight = new WPI_VictorSPX(Constants.BACK_RIGHT_ID);
        backRight.setInverted(Constants.BACK_RIGHT_INVERTED);

        backLeft = new WPI_VictorSPX(Constants.BACK_LEFT_ID);
        backLeft.setInverted(Constants.BACK_LEFT_INVERTED);
    }

    public void driveRight(final double val){
        frontRight.set(val);
        backRight.set(val);
    }

    public void driveLeft(final double val){
        frontLeft.set(val);
        backLeft.set(val);
    }

    public void drive(final double left, final double right){
        driveRight(right);
        driveLeft(left);
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

    /**
     * @return the controlMode
     */
    public ControlMode getControlMode() {
        return controlMode;
    }
}