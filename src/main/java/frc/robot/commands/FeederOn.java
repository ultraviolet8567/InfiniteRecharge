package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.MotorSpeeds;
import frc.robot.subsystems.Feeder;

public class FeederOn extends CommandBase {

    private final Feeder m_feeder;
    private double feeder_velocity = MotorSpeeds.feeder;
    
    public FeederOn(Feeder subsystem) {
        m_feeder = subsystem;
        addRequirements(m_feeder);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        m_feeder.setSpeed(feeder_velocity);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        m_feeder.stopMotor();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public boolean runsWhenDisabled() {
        return false;
    }
}
