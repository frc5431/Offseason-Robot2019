package frc.robot.components;

import frc.robot.Constants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Climber {
    private final CANSparkMax rightClimb, leftClimb;

    public Climber(){
        rightClimb = new CANSparkMax(Constants.CLIMBER_RIGHT_ID, MotorType.kBrushless);
        rightClimb.setInverted(Constants.CLIMBER_RIGHT_INVERTED);
        
        leftClimb = new CANSparkMax(Constants.CLIMBER_LEFT_ID, MotorType.kBrushless);
        leftClimb.setInverted(Constants.CLIMBER_LEFT_INVERTED);
    }

    public void climber(final double val){
        rightClimb.set(val);
        leftClimb.set(val);
    }

}