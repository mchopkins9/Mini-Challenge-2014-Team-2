/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.team2856;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

/**
 *
 * @author Reagan
 */
public class DriveTrain {
    private SpeedController left, right;
    private RobotDrive rd;
    
    public DriveTrain(){
        left = new Jaguar(RobotVariables.DT_MC_MODULE, RobotVariables.DT_MC_LEFT_CHANNEL);
        right = new Jaguar(RobotVariables.DT_MC_MODULE, RobotVariables.DT_MC_RIGHT_CHANNEL);
        rd = new RobotDrive(left, right);
    }
    
    public void move(double s){
        rd.tankDrive(s, s);
    }
    
    public void stop(){
        rd.stopMotor();
    }
}
