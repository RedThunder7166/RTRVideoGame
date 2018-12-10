package frc.robot.commands;


// import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.TimedCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;
import frc.robot.subsystems.RampSubsystem;
import frc.robot.subsystems.TankDriveSubsystem;

/**
 * TimedCommand
 * An example created to show how a timed based command would work.
 * This example is used to perform the usual auto run option during most FRC games.
 */
public class Auto1 extends TimedCommand {

    // Our reference to the tank drive subsystem
    TankDriveSubsystem tankDriveSubsystem;
    RampSubsystem rampSubsystem;

    // A fake encoder value, used for example


    /**
     * Default Constructor
     * We can handle setting the name and timeout this way if they don't need to be dynamic
     */
    public Auto1() {
        super("Auto 1", 15);
        init();
    }

    /**
     * Separating the initial setup out makes testing easier
     */
    protected void init() {
        tankDriveSubsystem = Robot.subsystemMaster.getTankDriveSubsystem();
        rampSubsystem = Robot.subsystemMaster.getRampSubsystem();

        requires(tankDriveSubsystem);
        
    }

    /**
     * Do your iteration work in the execute method of the Command. This runs at roughly 50hz.
     */
    @Override
    protected void execute() {
        // tankDriveSubsystem.videogamedrive(0.0, 1, 0.0);
        // Timer.delay(3);
        // tankDriveSubsystem.videogamedrive(0.0, 0.0, 0.2);
        // Timer.delay(2);
        // rampSubsystem.rampdrive(.65);
        // Timer.delay(1.5);
        SmartDashboard.putString("DB/String 7", "Auto1");
        // System.out.println("Driving in Auto!");
        
    }

    /**
     * We're watching for a fixed encoder value or the time out to happen.
     * Note: Using a fixed value for encoders is not a great idea.
     * @return
     */
    @Override
    protected boolean isFinished() {
        return false;
    }
}