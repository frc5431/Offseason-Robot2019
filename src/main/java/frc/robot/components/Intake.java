package frc.robot.components;

import frc.robot.Constants;
import frc.robot.Robot;
import frc.team5431.titan.core.robot.Component;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Intake extends Component<Robot>{
    private final CANSparkMax intake;

    public Intake() {
        intake = new CANSparkMax(Constants.INTAKE_ID, MotorType.kBrushless);
        intake.setInverted(Constants.INTAKE_INVERTED);
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