package org.usfirst.frc3930.PowerUp.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc3930.PowerUp.RobotMap;

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoSink;

/**
 *
 */
public class Cameras extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private final UsbCamera cam1 = RobotMap.camera1;
	//private final UsbCamera cam2 = RobotMap.camera2;
	private final VideoSink serv = RobotMap.server;
	private final CvSink cv1 = RobotMap.cvSink1;
	//private final CvSink cv2 = RobotMap.cvSink2;
	private boolean camOne = true;
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	//Camera 1
    	cv1.setSource(cam1);
    	cam1.setResolution(80, 60);
    	cam1.setFPS(10);
    	cv1.setEnabled(true);
    //	cv2.setSource(cam2);
    	//cv2.setEnabled(true);
    }
    
    @Override
    public void periodic() {
    	if(camOne) {
    		serv.setSource(cam1);
    	/*}else {
    		serv.setSource(cam2);
    		*/
    	}
    }
    
    public void cam1() {
    	camOne = true;
    }
    
   /* public void cam2() {
    	camOne = false;
    	
    }  */
}
