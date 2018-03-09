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
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class PGripper extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final DoubleSolenoid leftPiston = RobotMap.pneumaticsleftPiston;
    private final DoubleSolenoid rightPiston = RobotMap.pneumaticsrightPiston;
    private final Compressor compressor = RobotMap.pneumaticsCompressor;

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
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void leftExtend() {
    	leftPiston.set(Value.kForward);
    }
    
    public void leftRetract() {
    	leftPiston.set(Value.kReverse);
    }
    
    public void rightExtend() {
    	rightPiston.set(Value.kForward);
    }
    
    public void rightRetract() {
    	rightPiston.set(Value.kReverse);
    }
    
    public void leftOff() {
    	leftPiston.set(Value.kOff);
    }
    
    public void rightOff() {
    	rightPiston.set(Value.kOff);
    }

}

