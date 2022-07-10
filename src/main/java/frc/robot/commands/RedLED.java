// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.Button;
import frc.robot.subsystems.LED;

public class RedLED extends CommandBase {
  LED s_led;
  /** Creates a new RedLED. */
  public RedLED(LED s_led) {
    this.s_led = s_led;
    addRequirements(s_led);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // s_led.manualOn();

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    s_led.manualOn();
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
