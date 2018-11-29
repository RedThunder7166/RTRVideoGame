/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.RampSubsystem;
import frc.robot.subsystems.TankDriveSubsystem;

public class TeleopCommand extends CommandGroup {
  /**
   * Add your docs here.
   */
  public TeleopCommand() {

    
    TankDriveSubsystem tankDriveSubsystem;
    RampSubsystem rampSubsystem;
    IntakeSubsystem intakeSubsystem;

    // To run multiple commands at the same time,
    // use addParallel()
    // e.g. addParallel(new Command1());
    // addSequential(new Command2());
    // Command1 and Command2 will run in parallel.

    addParallel(new IntakeCommand());
    addParallel(new RampCommand());
    addParallel(new TankDriveCommand());

    // A command group will require all of the subsystems that each member
    // would require.
    // e.g. if Command1 requires chassis, and Command2 requires arm,
    // a CommandGroup containing them would require both the chassis and the
    // arm.

    intakeSubsystem = Robot.subsystemMaster.getIntakeSubsystem();
    rampSubsystem = Robot.subsystemMaster.getRampSubsystem();
    tankDriveSubsystem = Robot.subsystemMaster.getTankDriveSubsystem();


    requires(intakeSubsystem);
    requires(rampSubsystem);
    requires(tankDriveSubsystem);
  }
}
