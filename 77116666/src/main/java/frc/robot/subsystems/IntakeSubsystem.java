/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.IntakeCommand;


/**
 * Add your docs here.
 */
public class IntakeSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.


  protected VictorSP rampleftarm;
  protected VictorSP ramprightarm;

  protected DifferentialDrive differentialintakeDrive;


  public IntakeSubsystem() {
    init();
  }

  protected void init() {

  rampleftarm = new VictorSP(RobotMap.LARM);
  ramprightarm = new VictorSP(RobotMap.RARM);


  differentialintakeDrive = new DifferentialDrive(rampleftarm, ramprightarm);







  }

  @Override
  protected void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new IntakeCommand());
  }

  public void intakedrive (double leftyaxis){

    double speed = 0.0;
    double rotation = 0.0;

    if(leftyaxis != 0){
      speed = .65*leftyaxis;
    }else {
      //do nothing
    }

    differentialintakeDrive.arcadeDrive(speed, rotation);

  }

}
