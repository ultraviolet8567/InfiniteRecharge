package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.MotorSpeeds;
import frc.robot.subsystems.Shooter;

public class ShooterOnGreen extends CommandBase {

    private final Shooter m_shooter;
    private double green_top = MotorSpeeds.green_top;
    private double green_bottom = MotorSpeeds.green_bottom;

    public ShooterOnGreen(Shooter subsystem) {
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
        m_shooter.runTopMotor(green_top);
        m_shooter.runBottomMotor(green_bottom);
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
