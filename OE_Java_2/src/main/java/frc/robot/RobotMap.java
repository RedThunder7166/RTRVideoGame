/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  public static final int LARM = 4;
  public static final int L_1 = 6;
  public static final int L_2 = 7;
  public static final int RARM = 5;
  public static final int R_1 = 9;
  public static final int R_2 = 8;

  public static final int OP_STICK_PORT = 1;

  public static final int OP_LEFT_STICK = 1;
  public static final int OP_RIGHT_STICK = 5;
  

  public static final int FRONT_LEFT_MOTOR = 2;
  public static final int FRONT_RIGHT_MOTOR = 3;
  public static final int BACK_LEFT_MOTOR = 0;
  public static final int BACK_RIGHT_MOTOR = 1;

  public static final int DRIVE_STICK_PORT = 0;

  // Constants used to reference the controller inputs for teleop
  public static final int DRIVE_LEFT_TRIGGER = 2;
  public static final int DRIVE_RIGHT_TRIGGER = 3;
  public static final int DRIVE_STICK = 0;
  //Final tells me it cannot change in the code
  //Static means it can only exist once in memory
}
