package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Light extends SubsystemBase {
    private DigitalOutput light;
    private boolean isOn = false;
    
    public Light() {
        light = new DigitalOutput(0);
        addChild("Light", light);
    }

    // This method will be called once per scheduler run
    @Override
    public void periodic() {
        SmartDashboard.putString("Light:", isOn ? "On" : "Off");
    }

    @Override
    public void simulationPeriodic() {
    }
    
    public void toggleLight() {
        light.set(!isOn);
        isOn = light.get();
    }
}
