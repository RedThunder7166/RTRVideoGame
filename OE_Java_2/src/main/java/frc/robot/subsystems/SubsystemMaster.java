package frc.robot.subsystems;

/**
 * A helper class to set up all of our subsystems and to remove the logic from the main Robot class.
 * This class will typically live as a singleton (static) on the Robot class.
 */
public class SubsystemMaster {

    // Our reference to the tank drive subsystem
    TankDriveSubsystem tankDriveSubsystem;

    /**
     * Default Constructor
     * Instantiate all of your subsystems here
     */
    public SubsystemMaster() {
        tankDriveSubsystem = new TankDriveSubsystem();
    }

    /**
     * Used to get a reference on the tankDriveSubsystem
     * @return
     */
    public TankDriveSubsystem getTankDriveSubsystem() {
        return tankDriveSubsystem;
    }
}