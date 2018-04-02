package org.usfirst.frc3930.PowerUp.commands;

import org.usfirst.frc3930.PowerUp.Robot;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * 
 */
public class UnconditionalAuto extends CommandGroup {
	
    public UnconditionalAuto() {
        
    	requires(Robot.driveBase);
    	//addSequential(new AutonomousDrive(-0.75,-0.75,'a'),4);
    	Robot.driveBase.resetGyro();
    	addSequential(new AutonomousDrive(0.75,0),2.5);
    	
    	String gameData = DriverStation.getInstance().getGameSpecificMessage();
        if (gameData==null) { gameData = ""; }
        int retries = 100;
        while (gameData.length() < 2 && retries > 0) {
            DriverStation.reportError("Gamedata is " + gameData + " retrying " + retries, false);
            try {
                Thread.sleep(5);
                //sleep units = milliseconds
                gameData = DriverStation.getInstance().getGameSpecificMessage();
                if (gameData==null) { gameData = ""; }
            } catch (Exception e) {
            }
            retries--;
         }
        DriverStation.reportError("gameData before parse: " + gameData, false);
         
    	if (gameData.length()>0){
    		if (gameData.charAt(0) == 'R') {
    			addSequential(new armDropManual(),0.3);
    			addSequential(new shootCube(),3);
    		}
    	}
    }
}