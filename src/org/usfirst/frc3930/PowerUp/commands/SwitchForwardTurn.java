package org.usfirst.frc3930.PowerUp.commands;

import org.usfirst.frc3930.PowerUp.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class SwitchForwardTurn extends CommandGroup {

    public SwitchForwardTurn() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	addParallel(new armDropManual(),1);
    	
    	String gameData;
        
		//gameData = DriverStation.getInstance().getGameSpecificMessage();
		/*if(gameData.charAt(0) == 'L') {
			
			Robot.driveBase.setDriveAngle(0);
			addSequential(new AutonomousDrive(-0.75,-0.75,'c'), 3.2);
			Robot.driveBase.setTurnAngle(85);
			addSequential(new AutonomousDrive(-0.60,0.60,'b'),3);
			Robot.driveBase.setDriveAngle(90);
			addSequential(new AutonomousDrive(-0.75,-0.75, 'c'),1);
			addSequential(new shootCube(),3);
			
		}
		else if(gameData.charAt(0) == 'R') {
			
			Robot.driveBase.setDriveAngle(0);
			addSequential(new AutonomousDrive(-0.75,-0.75,'c'), 3.2);
			
		}else {
			
			Robot.driveBase.setDriveAngle(0);
			addSequential(new AutonomousDrive(-0.75,-0.75,'c'), 3.2);
		}*/
    }
}
