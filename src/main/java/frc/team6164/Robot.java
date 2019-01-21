/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team6164;

import edu.wpi.first.wpilibj.*;
import com.ctre.phoenix.motorcontrol

public class Robot extends IterativeRobot {
	
	Joystick stick;
	SpeedController motor;
	
    public void robotInit() {
    	
        stick = new Joystick(0);
        motor = new WPI_TalonSRX(2);
    }

     
    public void disabledInit() { }

     
    public void autonomousInit() { }

     
    public void teleopInit() { }

     
    public void testInit() { }


     
    public void disabledPeriodic() { }
    
     
    public void autonomousPeriodic() { }

     
    public void teleopPeriodic() { 
    	
    	 double speed=stick.getY();
    	    motor.set(speed);
    }

     
    public void testPeriodic() { }
}