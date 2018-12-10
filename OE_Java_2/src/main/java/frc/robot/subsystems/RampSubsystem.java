/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.RampCommand;

/**
 * Add your docs here.
 */
public class RampSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.


  protected VictorSP rampfrontleft;
  protected VictorSP rampfrontright;
  protected VictorSP rampbackleft;
  protected VictorSP rampbackright;

  protected SpeedControllerGroup leftrampgroup;
  protected SpeedControllerGroup rightrampgroup;

  protected DifferentialDrive differentialrampDrive; 


  public RampSubsystem() {
    init();
  }

  protected void init() {

    rampfrontleft = new VictorSP(RobotMap.L_1);
    rampfrontright = new VictorSP(RobotMap.R_1);
    rampbackleft = new VictorSP(RobotMap.L_2);
    rampbackright = new VictorSP(RobotMap.R_2);
    

    leftrampgroup = new SpeedControllerGroup(rampfrontleft, rampbackleft);
    rightrampgroup = new SpeedControllerGroup(rampfrontright, rampbackright);

    differentialrampDrive = new DifferentialDrive(leftrampgroup, rightrampgroup);

  }

  @Override
  protected void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new RampCommand());
  }

  public void rampdrive (double rightyaxis){
    
    double speed = 0.0;
    double rotation = 0.0;

    if(rightyaxis != 0){
      speed = .65*rightyaxis;
    }else {
      //do nothing
    }

    differentialrampDrive.arcadeDrive(speed, rotation);

  }
  
}


