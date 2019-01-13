/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;



import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.SubsystemMaster;
import frc.robot.Robot;
// import frc.robot.commands.Auto1;
// import frc.robot.commands.Auto2;
// import frc.robot.commands.Auto3;
// import frc.robot.commands.AutoLine;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  public static final SubsystemMaster subsystemMaster = new SubsystemMaster();

public static final String SubsystemMaster = null;

  public static OI oi;

  //private Command m_autonomousCommand;
  private SendableChooser<Command> autoChooser = new SendableChooser<>();
  Command Auto1;
  // Command Auto2;
  // Command Auto3;
  // Command AutoLine;
private Command autonomousCommand;

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    oi = new OI();
    // autoChooser.addDefault("Line", new AutoLine());
    // autoChooser.addObject("Left", new Auto1());
    // autoChooser.addObject("Middle", new Auto2());
    // autoChooser.addObject("Right", new Auto3());
    SmartDashboard.putData("Auto mode", autoChooser);
    SmartDashboard.putString("DB/String 6", "My 21 Char TestString");
    

  }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */

  /**
   * This function is called once each time the robot enters Disabled mode.
   * You can use it to reset any subsystem information you want to clear when
   * the robot is disabled.
   */
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString code to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional commands to the
   * chooser code above (like the commented example) or additional comparisons
   * to the switch structure below with additional strings & commands.
   */
  @Override
  public void autonomousInit() {
    SmartDashboard.putString("DB/String 5", "AutoInit");

    // String autoSelected = SmartDashboard.getString("Auto Selector",
    // "Default"); switch(autoSelected) { case "My Auto": Auto1
    // = new Auto1(); break; case "Default Auto": default:
    // Auto1 = new Auto1(); break; }

    
    // autonomousCommand = autoChooser.getSelected();

    Auto1 = autoChooser.getSelected();

    // if (autonomousCommand != null) {
    //   autonomousCommand.start();
    // }


    // boolean LEFT;
    // LEFT = SmartDashboard.getBoolean("DB/Button 0", false);
    // boolean MIDDLE;
		// MIDDLE = SmartDashboard.getBoolean("DB/Button 1", false);
    // boolean RIGHT;
    // RIGHT = SmartDashboard.getBoolean("DB/Button 2", false);

    //   if(LEFT == true){
    //     SmartDashboard.putString("DB/String 0", "Left Position");
        
    //     Auto1.start();
    //     //Scheduler.getInstance().run();
        
    //   }else if(MIDDLE == true){
    //     SmartDashboard.putString("DB/String 0", "Middle Position");

    //     Auto2.start();
    //     //Scheduler.getInstance().run();

    //   }else if(RIGHT == true){
    //     SmartDashboard.putString("DB/String 0", "Right Postition");

    //     Auto3.start();
    //     //Scheduler.getInstance().run();

    //   }else{
    //     SmartDashboard.putString("DB/String 0", "Cross Line");

    //     AutoLine.start();
    //     //Scheduler.getInstance().run();

    //   }

      
    // schedule the autonomous command (example)
  
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {

    if (autonomousCommand != null) {
      autonomousCommand.cancel();
    }

    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    // if (Auto1 != null) {
    //   Auto1.cancel();
    // }if (Auto2 != null) {
    //   Auto2.cancel();
    // }if (Auto3 != null) {
    //   Auto3.cancel();
    // }if (AutoLine != null) {
    //   AutoLine.cancel();
    //}
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
    

//    ░▀▀█▀▀░░░░█▀▀▀░█▀▀█░█░░░█░ 
//    ░░░█░░▀▀░░█░▀█░█▀▀█░░▀█▀░░ 
//    ░░░█░░░░░░█▄▄█░█░░█░░░█░░░
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
    //**i don't like you T-Series
    /*nothin' personal kid
    /*but I have to go all out
    /* */
  }
}