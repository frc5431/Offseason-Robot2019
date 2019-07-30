package frc.robot.components;

import frc.robot.Constants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Intake {
    private final CANSparkMax rightIntake, leftIntake;

    public Intake() {
        rightIntake = new CANSparkMax(Constants.INTAKE_RIGHT_ID, MotorType.kBrushless);
        rightIntake.setInverted(Constants.INTAKE_RIGHT_INVERTED);
        
        leftIntake = new CANSparkMax(Constants.INTAKE_LEFT_ID, MotorType.kBrushless);
        leftIntake.setInverted(Constants.INTAKE_LEFT_INVERTED);
    }

    public void intake(final double val){
        rightIntake.set(val);
        leftIntake.set(val);
    }

}