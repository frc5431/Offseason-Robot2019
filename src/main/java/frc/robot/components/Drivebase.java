package frc.robot.components;

import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;;

public class Drivebase {
    private final WPI_VictorSPX frontRight, frontLeft, backRight, backLeft;

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

    public void drive(final double right, final double left){
        driveRight(right);
        driveLeft(left);
    }

}