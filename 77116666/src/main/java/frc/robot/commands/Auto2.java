// package frc.robot.commands;

// import edu.wpi.first.wpilibj.command.Command;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import frc.robot.Robot;
// import frc.robot.subsystems.RampSubsystem;
// import frc.robot.subsystems.TankDriveSubsystem;

// public class Auto2 extends Command {

//   TankDriveSubsystem tankDriveSubsystem;
//   RampSubsystem rampSubsystem;

//   public Auto2() {


//     // Use requires() here to declare subsystem dependencies
//     // eg. requires(chassis);
//   }

//   // Called just before this Command runs the first time
//   @Override
//   protected void initialize() {

//     tankDriveSubsystem = Robot.subsystemMaster.getTankDriveSubsystem();
//     rampSubsystem = Robot.subsystemMaster.getRampSubsystem();

//     requires(tankDriveSubsystem);
//     requires(rampSubsystem);

//   }

//   // Called repeatedly when this Command is scheduled to run
//   @Override
//   protected void execute() {
//     SmartDashboard.putString("DB/String 7", "Auto2");
//   }

//   // Make this return true when this Command no longer needs to run execute()
//   @Override
//   protected boolean isFinished() {
//     return false;
//   }

//   // Called once after isFinished returns true
//   @Override
//   protected void end() {
//   }

//   // Called when another command which requires one or more of the same
//   // subsystems is scheduled to run
//   @Override
//   protected void interrupted() {
//   }
// }
