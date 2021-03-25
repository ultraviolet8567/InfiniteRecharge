package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.MotorSpeeds;
import frc.robot.subsystems.Shooter;

public class ShooterOnRed extends CommandBase {

    private final Shooter m_shooter;
    private double red_top = MotorSpeeds.red_top;
    private double red_bottom = MotorSpeeds.red_bottom;

    public ShooterOnRed(Shooter subsystem) {
        m_shooter = subsystem;
        addRequirements(m_shooter);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        m_shooter.runTopMotor(red_top);
        m_shooter.runBottomMotor(red_bottom);
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public boolean runsWhenDisabled() {
        return false;
    }
}
