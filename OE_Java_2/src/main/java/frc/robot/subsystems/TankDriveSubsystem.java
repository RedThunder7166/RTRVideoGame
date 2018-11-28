package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TeleopCommand;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;



public class TankDriveSubsystem extends Subsystem{

    protected Spark frontLeft;
    protected Spark frontRight;
    protected Spark backLeft;
    protected Spark backRight;

    //Declare a couple motor groups

    protected SpeedControllerGroup leftMotorGroup;
    protected SpeedControllerGroup rightMotorGroup;

    protected DifferentialDrive differentialDrive;

    //Create a constructor
    //This is the one that will default start on this subsystem

    public TankDriveSubsystem() {
        init();

    }
    //once we are in our init method we are going to set the sparks up

    protected void init() {
        frontLeft = new Spark(RobotMap.FRONT_LEFT_MOTOR);
        frontRight = new Spark(RobotMap.FRONT_RIGHT_MOTOR);
        backLeft = new Spark(RobotMap.BACK_RIGHT_MOTOR);
        backRight = new Spark(RobotMap.BACK_LEFT_MOTOR);

        leftMotorGroup = new SpeedControllerGroup(frontLeft, backLeft);
        rightMotorGroup = new SpeedControllerGroup(frontRight, backRight);

        differentialDrive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);

    }

    @Override
    protected void initDefaultCommand() {
        //
        setDefaultCommand(new TeleopCommand());
    }

    // public void driveasTank(double speed, double rotation){
    //     differentialDrive.arcadeDrive(speed, rotation);
    // }
    public void videogamedrive (double leftTrigger, double rightTrigger, double turn){
        double speed = 0.0;
        double rotation = 0.0;

        if(rightTrigger > 0){
            speed = rightTrigger;
            System.out.println(rightTrigger);
            // You want to turn right while going forward
            if(turn > .15){
              speed = rightTrigger;
              //rotation = .40*turn*rightTrigger; //Slows down right side based on how fast the bot is moving forward
            }
            //You want to turn left while going forward
            if(turn < -.15){
              //rotation = .40*turn*rightTrigger; //Slows down left side based on how fast the bot is moving forward
              speed = -1*rightTrigger; 
            }
        }else if(leftTrigger > 0){
            speed = -1*leftTrigger;
            // You want to turn right while going backward
            if(turn > .15){
              //rotation = .40*turn*leftTrigger; // Left goes forward slow - positive
              speed = leftTrigger; // Right goes backward - positive
                  }
            // You want to turn left while going backward
              if(turn < -.15){
              speed = -1*leftTrigger; // Left goes backward - negative
              //rotation = .40*turn*leftTrigger; //Right goes forward slow - negative
            } 
          
          }else if(leftTrigger == 0 && rightTrigger == 0){
              speed = .400*turn;
          }else{
              //do nothing
          }
            System.out.println("Speed: " + speed);
            System.out.println("Rotation: " + rotation);

            differentialDrive.arcadeDrive(speed, rotation);
        }
    }
