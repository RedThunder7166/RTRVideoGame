package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.IntakeSubsystem;

/**
 * An example of how a teleop command might look for drive controls
 */
public class IntakeCommand extends Command {

    // Our reference to the intake subsystem
    IntakeSubsystem intakeSubsystem;

    // Our reference to the joystick that we want to use
    Joystick opjoystick;

    /**
     * Default Constructor
     */
    public IntakeCommand() {
        init();
    }

    /**
     * Separating the initial setup out makes testing easier
     */
    protected void init() {
        intakeSubsystem = Robot.subsystemMaster.getIntakeSubsystem();
        opjoystick = Robot.oi.getopjoystick();

        requires(intakeSubsystem);
    }

    /**
     * Do your iteration work in the execute method of the Command. This runs at roughly 50hz.
     */
    @Override
    protected void execute() {
        //You might do something like this to debug the joystick input
       System.out.println("SpEeD: " + opjoystick.getRawAxis(RobotMap.OP_LEFT_STICK));

        //A custom video game drive to mimic a different type of input

        //If you want to alter the input before passing it to the controller, you can do that here.
       //rotation = Math.pow(RobotMap.DRIVE_STICK, 3);

        //The call to our subsystem with the altered rotation value from above
       intakeSubsystem.intakedrive(opjoystick.getRawAxis(RobotMap.OP_LEFT_STICK));
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