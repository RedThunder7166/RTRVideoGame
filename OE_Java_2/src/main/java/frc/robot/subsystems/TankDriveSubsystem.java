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
        backLeft = new Spark(RobotMap.BACK_LEFT_MOTOR);
        backRight = new Spark(RobotMap.BACK_RIGHT_MOTOR);

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
    public void videogamedrive (double leftTrigger, double rightTrigger, double rotation){
       
        double turn = 0.0;
        double speed = 0.0;


        if(rightTrigger != 0){
            speed = rightTrigger;
            System.out.println(rightTrigger);
            if(Math.abs(rotation) > .15) {
                turn = rotation;
            }
        
        }else if(leftTrigger != 0){
            speed = -1*leftTrigger;
            System.out.println(leftTrigger);
            if(Math.abs(rotation) > .15) {
                turn = rotation;
            }
        }else if(Math.abs(rotation) > .15){
            turn = rotation;
        }else{
            //do nothing
        }
            System.out.println("sPeEd:" + speed);
            System.out.println("tUrN: " + turn);

        differentialDrive.arcadeDrive(speed, turn);
        }
    }
