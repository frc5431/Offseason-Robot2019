package frc.robot.components;

import frc.robot.Constants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Intake {
    private final CANSparkMax intake;

    public Intake() {
        intake = new CANSparkMax(Constants.INTAKE_ID, MotorType.kBrushless);
        intake.setInverted(Constants.INTAKE_INVERTED);
    }

}