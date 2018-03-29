package org.usfirst.frc3930.PowerUp.commands;

import org.usfirst.frc3930.PowerUp.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CubeAuto extends CommandGroup {

    public CubeAuto() {
    	addSequential(new armDropManual(),0.3);
		System.out.println("Working");
		addSequential(new leftPistonExtend());
		addSequential(new rightPistonExtend());
		addSequential(new shootCube(),1);
    }
}
