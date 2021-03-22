package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Spark;

public class Shooter extends SubsystemBase {
    
    private Spark shooterTopMotor;
    private Spark shooterBottomMotor;
    
    public Shooter() {
        shooterTopMotor = new Spark(1);
        addChild("ShooterTopMotor", shooterTopMotor);
        shooterTopMotor.setInverted(false);

        shooterBottomMotor = new Spark(0);
        addChild("ShooterBottomMotor", shooterBottomMotor);
        shooterBottomMotor.setInverted(false);
    }

    // This method will be called once per scheduler run
    @Override
    public void periodic() {
        SmartDashboard.putNumber("Motor Speeds: Shooter Top", shooterTopMotor.getSpeed());
        SmartDashboard.putNumber("Motor Speeds: Shooter Bottom", shooterBottomMotor.getSpeed());
    }

    @Override
    public void simulationPeriodic() {
    }

    public double getTopMotorSpeed() {
        return shooterTopMotor.getSpeed();
    }

    public double getBottomMotorSpeed() {
        return shooterBottomMotor.getSpeed();
    }

    public void runTopMotor(double pwmInput) {
        shooterTopMotor.setSpeed(pwmInput);
    }

    public void runBottomMotor(double pwmInput) {
        shooterBottomMotor.setSpeed(pwmInput);
    }

    public void stopTopMotor() {
        shooterTopMotor.stopMotor();
    }

    public void stopBottomMotor() {
        shooterBottomMotor.stopMotor();
    }
}
