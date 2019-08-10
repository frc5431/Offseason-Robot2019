package frc.robot.components;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;
import frc.team5431.titan.core.robot.Component;

public class Dashboard extends Component<Robot> {
    private final SendableChooser<Boolean> tankChooser = new SendableChooser<>();

    public Dashboard() {
        tankChooser.setDefaultOption("Tank Drive", true);
        tankChooser.addOption("Arcade", false);

        SmartDashboard.putData("tank",tankChooser);
    }

    @Override
    public void init(Robot robot) {
        SmartDashboard.putData("tank",tankChooser);
    }

    @Override
    public void periodic(Robot robot) {

    }

    @Override
    public void disabled(Robot robot) {

    }

    public Boolean getTankChooser() {
        return tankChooser.getSelected();
    }
}