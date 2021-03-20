package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.MotorSpeeds;
import frc.robot.subsystems.Shooter;

public class ShooterOnBlue extends CommandBase {

    private final Shooter m_shooter;
    private double blue_top = MotorSpeeds.blue_top;
    private double blue_bottom = MotorSpeeds.blue_bottom;

    public ShooterOnBlue(Shooter subsystem) {       
        m_shooter = subsystem;
        addRequirements(m_shooter);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        m_shooter.runTopMotor(blue_top);
        m_shooter.runBottomMotor(blue_bottom);
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

    @Override
    public boolean runsWhenDisabled() {
        return false;
    }
}
