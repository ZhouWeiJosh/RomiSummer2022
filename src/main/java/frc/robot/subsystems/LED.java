// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;

/** Add your docs here. */
public class LED {
    DigitalOutput[] led;
    DigitalInput button = new DigitalInput(0);
    boolean buttonAOff = true;

    public LED() { 
        led = new DigitalOutput[3];
        led[0] = new DigitalOutput(1);
        led[1] = new DigitalOutput(2);
        led[2] = new DigitalOutput(3);
    

    }

    public void buttonA() {
        if(button.get()) {
        System.out.print("Is working?");
        led[2].set(false);
        buttonAOff = false;
        }else if(button.get() && buttonAOff == false){
            led[2].set(true);
            buttonAOff = true;
        } 
    }

    public void buttonAOff() {
    }
}
