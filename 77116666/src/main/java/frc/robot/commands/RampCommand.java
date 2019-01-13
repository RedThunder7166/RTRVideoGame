package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.RampSubsystem;

/**
 * An example of how a teleop command might look for drive controls
 */
public class RampCommand extends Command {

    // Our reference to the ramp subsystem
    RampSubsystem rampSubsystem;

    // Our reference to the joystick that we want to use
    Joystick opjoystick;

    /**
     * Default Constructor
     */
    public RampCommand() {
        init();
    }

    /**
     * Separating the initial setup out makes testing easier
     */
    protected void init() {
        rampSubsystem = Robot.subsystemMaster.getRampSubsystem();
        opjoystick = Robot.oi.getopjoystick();

        requires(rampSubsystem);
    }

    /**
     * Do your iteration work in the execute method of the Command. This runs at roughly 50hz.
     */
    @Override
    protected void execute() {
        //You might do something like this to debug the joystick input
       System.out.println("SpEeD: " + opjoystick.getRawAxis(RobotMap.OP_RIGHT_STICK));

        //The call to our subsystem with the altered rotation value from above
       rampSubsystem.rampdrive(opjoystick.getRawAxis(RobotMap.OP_RIGHT_STICK));
    }

    /**
     * This command should never finish on its own,
     * instead it will be canceled by other commands that need this subsystem.
     * @return
     */
    @Override
    protected boolean isFinished() {
        return false;
    }
}