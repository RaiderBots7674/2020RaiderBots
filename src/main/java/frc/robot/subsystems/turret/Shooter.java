/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.turret;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.InvertType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.models.BobTalonFX;



public class Shooter extends SubsystemBase {
  private BobTalonFX shooterLead = new BobTalonFX(11);
  private BobTalonFX shooterFollow = new BobTalonFX(12);

  //private final PhoenixGains shooterGains = new PhoenixGains(0, 0, 0, 0, 0, 0);
  //private MotionParameters shooterMotionParameters = new MotionParameters(0, 0, shooterGains);
   
  public Shooter() {
    //this.shooterLead.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
    //this.shooterLead.configClosedloopRamp(0.25);
    //this.shooterLead.configMotionParameters(shooterMotionParameters);
    this.shooterFollow.follow(shooterLead);
    this.shooterFollow.setInverted(InvertType.InvertMotorOutput);
  }

 // public double getVelocity() {
    //double currentVelocity = this.shooterLead.getSelectedSensorVelocity();
   // return currentVelocity;
 // }

 // public double getPosition() {
    //double currentPosition = this.shooterLead.getSelectedSensorPosition();
    //return currentPosition;
  ////}

  @Override
  public void periodic() {
   // SmartDashboard.putNumber("Shooter Velocity", this.getVelocity() / 2048 * 600);
   // SmartDashboard.putNumber("Shooter Position", this.getPosition());
  }

  public void set(ControlMode controlMode, double setpoint) {
    shooterLead.set(controlMode, setpoint);
  }

}
