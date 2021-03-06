// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3930.PowerUp.subsystems;

import org.usfirst.frc3930.PowerUp.Robot;
import org.usfirst.frc3930.PowerUp.RobotMap;
import org.usfirst.frc3930.PowerUp.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Arm extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController armMotor = RobotMap.armarmMotor;
    private final DigitalInput lowLimit = RobotMap.armlowLimit;
    private final DigitalInput highLimit = RobotMap.armHighLimit;
    
    private static final double ARM_SPEED = 0.75;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop
    	armMotor.set(armTeleop() * ARM_SPEED);
    	//armMotor.set(getArmAxis());
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    //PRIVATE STUFF
   
   public boolean getHighLimit() {
	   return highLimit.get();
   }
   
   public boolean getLowLimit() {
	   return lowLimit.get();
   }
   
   private double getArmAxis() {
	   return Robot.oi.joystick.getRawAxis(5);
   }
   
   private double armTeleop() {
	   	if(!getHighLimit()) {
	   		if(getArmAxis() >= 0) {
	   			return getArmAxis();
	   		}else {
	   			return 0;
	   		}
	   	}
	   	else if(!getLowLimit()) {
	   		if(getArmAxis() <= 0) {
	   			return getArmAxis();
	   		}else {
	   			return 0;
	   		}
	   	}else{
	   		return getArmAxis();
	   	}
   }
   
   //PUBLIC STUFF
   
   public void moveArmDown() {
	   if(!getLowLimit()) {
		   armMotor.set(1);
	   }else {
		   armMotor.set(0);
	   }
   }
   
   public void armUp() {
	   armMotor.set(-1);
   }
   
   public void armDown() {
	   armMotor.set(1);
   }
   
   public void stop() {
	   armMotor.set(0);
   }
}