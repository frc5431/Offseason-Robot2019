package frc.robot.components;

import frc.robot.Constants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Climber {
    private final CANSparkMax climb, climbWheel;

    public Climber(){
        climb = new CANSparkMax(Constants.CLIMBER_ID, MotorType.kBrushless);
        climb.setInverted(Constants.CLIMBER_INVERTED);
        
        climbWheel = new CANSparkMax(Constants.CLIMBER_WHEELS_ID, MotorType.kBrushless);
        climbWheel.setInverted(Constants.CLIMBER_WHEELS_INVERTED);
    }

}