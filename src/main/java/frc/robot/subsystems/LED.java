// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LED extends SubsystemBase {
    DigitalOutput yellowLight = new DigitalOutput(2);
    DigitalInput buttonA = new DigitalInput(0);
  /** Creates a new LED. */
  public LED() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public boolean getButtonA() {
      return buttonA.get();
  }

  public void manualOn() {
    yellowLight.set(true);
  }

  public void manualOff() {
      yellowLight.set(false);
  }
}
