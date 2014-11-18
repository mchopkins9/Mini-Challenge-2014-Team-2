/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.team2856;

import edu.wpi.first.wpilibj.Jaguar;

/**
 *
 * @author Reagan
 */
public class Arm {
    private Jaguar armMotor;
    
    public Arm(){
        armMotor = new Jaguar(RobotVariables.ARM_MC_MODULE, RobotVariables.ARM_MC_CHANNEL);
    }
    
    public void move(double s){
        armMotor.set(s);
    }
    
    public void stop(){
        armMotor.stopMotor();
    }
}
