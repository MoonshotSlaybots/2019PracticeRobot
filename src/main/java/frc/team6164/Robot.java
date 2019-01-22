/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team6164;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


public class Robot extends TimedRobot {
	
    Joystick controller;
    SpeedController BL;
    SpeedController BR;
    SpeedController FR;
    SpeedController FL;
    MecanumDrive drive;
	
    @Override
    public void robotInit() {
      
        controller = new Joystick(0);

      BL= new WPI_TalonSRX(1);
      BR= new WPI_TalonSRX(2);
	    FR= new WPI_TalonSRX(3);
	    FL= new WPI_TalonSRX(4);
                                			//the WPI_TalonSRX is a type for wpi (is considered a SpeedController object
                                      //the regular TalonSRX is not meant for wpi use so is not a SpeedController object    
      drive = new MecanumDrive(FL, BL, FR, BR); 
      drive.setSafetyEnabled(false);
      
      CameraServer.getInstance().startAutomaticCapture("cam0",0);
    }

    @Override
    public void disabledInit() { 

    }

    @Override
    public void autonomousInit() { 

    }

    @Override
    public void teleopInit() { 

    }

    @Override
    public void testInit() { 

    }


    @Override
    public void disabledPeriodic() { 

    }
    
    @Override
    public void autonomousPeriodic() { 

    }

    @Override
    public void teleopPeriodic() { 
      drive.driveCartesian(controller.getX()*-1, controller.getY(), controller.getRawAxis(4));
    }

    @Override
    public void testPeriodic() { 

    }
}