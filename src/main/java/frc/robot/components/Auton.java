package frc.robot.components;

import java.util.HashMap;

import frc.robot.Robot;
import frc.robot.auto.Sequence;
import frc.team5431.titan.core.robot.CommandQueue;
import frc.team5431.titan.core.robot.Component;
import frc.team5431.titan.core.robot.WaitCommand;

public class Auton extends Component<Robot> {
    private CommandQueue<Robot> sequenceCommands, drivebaseCommands, preloadedAutoCommands;

    private HashMap<Integer, Sequence> sequences = new HashMap<>();

    private Sequence runningSequence = null;

    public Auton() {
        sequenceCommands = new CommandQueue<>();
        drivebaseCommands = new CommandQueue<>();
        preloadedAutoCommands = new CommandQueue<>();
    }

    @Override
    public void init(Robot robot) {
        switch(robot.getMode()) {
            case AUTO:
                drivebaseCommands.clear();
                drivebaseCommands.add(new WaitCommand<>(100));
                drivebaseCommands.addAll(preloadedAutoCommands);
                preloadedAutoCommands.clear();
                break;
            case TEST:
                break;
            case TELEOP:
                break;
            case DISABLED:
                break;
            default:
                abort(robot);
                break;
        }

        drivebaseCommands.init(robot);
        sequenceCommands.init(robot);
    }

    @Override
    public void periodic(Robot robot) {

    }

    @Override
    public void disabled(Robot robot) {

    }

    public void abort(final Robot robot){
        sequenceCommands.done(robot);
        sequenceCommands.clear();

        drivebaseCommands.done(robot);
        drivebaseCommands.clear();
    }
}