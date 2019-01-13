/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.PneumaticsSubsystem;

public class PneumaticsOpenCommand extends Command {

  PneumaticsSubsystem pneumaticsSubsystem;

  Joystick joystick;

  Solenoid testSol = new Solenoid(4,0);

  public PneumaticsOpenCommand() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);

  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    pneumaticsSubsystem = Robot.subsystemMaster.getPneumaticsSubsystem();
    joystick = Robot.oi.getjoystick();

    requires(pneumaticsSubsystem);

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    
    testSol.close();

    testSol.set(true);

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    testSol.set(false);
  }
}
