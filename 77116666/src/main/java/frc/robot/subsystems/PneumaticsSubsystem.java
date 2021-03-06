/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.PneumaticsCloseCommand;

/**
 * Add your docs here.
 */
public class PneumaticsSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.




public PneumaticsSubsystem(){
  init();
}
  protected void init() {
    Solenoid testSol = new Solenoid(0,0);
    Compressor testC = new Compressor(0);

    testSol.set(false);




  }



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new PneumaticsCloseCommand());
  }
}
