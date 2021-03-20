package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Spark;

public class Feeder extends SubsystemBase {
    private Spark feederStorageMotor;
    
    public Feeder() {
        feederStorageMotor = new Spark(3);
        addChild("FeederStorageMotor", feederStorageMotor);
        feederStorageMotor.setInverted(false);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
        SmartDashboard.putNumber("Motor Speed: Feeder", feederStorageMotor.getSpeed());
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation
        SmartDashboard.putNumber("Motor Speeds/Feeder", feederStorageMotor.getSpeed());
    }
    
    public void setSpeed(double speed) {
        feederStorageMotor.setSpeed(speed);
    }

    public void stopMotor() {
        feederStorageMotor.stopMotor();
    }
}
