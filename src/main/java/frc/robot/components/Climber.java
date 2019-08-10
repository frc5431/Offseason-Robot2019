package frc.robot.components;

import frc.robot.Robot;
import frc.robot.Constants;
import frc.team5431.titan.core.robot.Component;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Climber extends Component<Robot> {
    private final CANSparkMax climb, climbWheel;

    public Climber(){
        climb = new CANSparkMax(Constants.CLIMBER_ID, MotorType.kBrushless);
        climb.setInverted(Constants.CLIMBER_INVERTED);
        
        climbWheel = new CANSparkMax(Constants.CLIMBER_WHEELS_ID, MotorType.kBrushless);
        climbWheel.setInverted(Constants.CLIMBER_WHEELS_INVERTED);
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