package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Feeder extends SubsystemBase {
    private Spark feederStorageMotor;
    
    public Feeder() {
        feederStorageMotor = new Spark(3);
        addChild("FeederStorageMotor", feederStorageMotor);
        feederStorageMotor.setInverted(false);
    }

    // This method will be called once per scheduler run
    @Override
    public void periodic() {
        SmartDashboard.putNumber("Motor Speed: Feeder", feederStorageMotor.getSpeed());
    }

    @Override
    public void simulationPeriodic() {
    }
    
    public void setSpeed(double speed) {
        feederStorageMotor.setSpeed(speed);
    }

    public void stopMotor() {
        feederStorageMotor.stopMotor();
    }
}
