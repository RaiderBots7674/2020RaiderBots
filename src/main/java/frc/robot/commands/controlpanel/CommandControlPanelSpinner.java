/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.controlpanel;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class CommandControlPanelSpinner extends CommandBase {
  public double percentageValue = 0;
  public ControlMode controlModeValue = ControlMode.PercentOutput;
  private int mode;

  /**
   * Creates a new CommandControlPanelSpinner.
   */
  public CommandControlPanelSpinner(ControlMode controlMode, int mode) {
    addRequirements(Robot.controlPanelSpinner);
    this.mode = mode;
    }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {   
    if(this.mode == 0){
      Robot.controlPanelSpinner.setControlPanelMode(this.mode, 0);
      Robot.controlPanelSpinner.set();
    } else{
      Robot.controlPanelSpinner.setControlPanelMode(this.mode, .20);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
