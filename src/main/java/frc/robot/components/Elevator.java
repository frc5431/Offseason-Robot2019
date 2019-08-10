package frc.robot.components;

import frc.robot.Constants;
import frc.team5431.titan.core.robot.Component;
import frc.robot.Robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Elevator extends Component<Robot>{
    private final CANSparkMax rightElev, leftElev;

    public Elevator(){
        rightElev = new CANSparkMax(Constants.ELEVATOR_RIGHT_ID, MotorType.kBrushless);
        rightElev.setInverted(Constants.ELEVATOR_RIGHT_INVERTED);
        
        leftElev = new CANSparkMax(Constants.ELEVATOR_LEFT_ID, MotorType.kBrushless);
        leftElev.setInverted(Constants.ELEVATOR_LEFT_INVERTED);
    }

    public void elevator(final double val){
        rightElev.set(val);
        leftElev.set(val);
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