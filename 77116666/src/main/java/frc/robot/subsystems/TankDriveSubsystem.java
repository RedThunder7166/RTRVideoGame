package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDriveCommand;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;



public class TankDriveSubsystem extends Subsystem{

    protected VictorSP frontLeft;
    protected VictorSP frontRight;
    protected VictorSP backLeft;
    protected VictorSP backRight;

    //Declare a couple motor groups

    protected SpeedControllerGroup leftMotorGroup;
    protected SpeedControllerGroup rightMotorGroup;

    protected DifferentialDrive differentialvideogameDrive;

    //Create a constructor
    //This is the one that will default start on this subsystem

    public TankDriveSubsystem() {
        init();

    }
    //once we are in our init method we are going to set the VictorSPs up

    protected void init() {
        frontLeft = new VictorSP(RobotMap.FRONT_LEFT_MOTOR);
        frontRight = new VictorSP(RobotMap.FRONT_RIGHT_MOTOR);
        backLeft = new VictorSP(RobotMap.BACK_LEFT_MOTOR);
        backRight = new VictorSP(RobotMap.BACK_RIGHT_MOTOR);

        leftMotorGroup = new SpeedControllerGroup(frontLeft, backLeft);
        rightMotorGroup = new SpeedControllerGroup(frontRight, backRight);

        differentialvideogameDrive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);

    }

    @Override
    protected void initDefaultCommand() {
        //
        setDefaultCommand(new TankDriveCommand());
    }

    // public void driveasTank(double speed, double rotation){
    //     differentialDrive.arcadeDrive(speed, rotation);
    // }
    public void videogamedrive (double leftTrigger, double rightTrigger, double rotation){
       
        double turn = 0.0;
        double speed = 0.0;


        if(rightTrigger != 0){
            speed = .55*rightTrigger;
            System.out.println(.55*rightTrigger);
            if(Math.abs(rotation) > .15) {
                turn = rotation;
            }
        
        }else if(leftTrigger != 0){
            speed = -.55*leftTrigger;
            System.out.println(.55*leftTrigger);
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

        differentialvideogameDrive.arcadeDrive(speed, turn);
        }
    }
