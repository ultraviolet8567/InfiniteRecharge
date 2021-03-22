package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class DriveToggle extends CommandBase {

    private final Drivetrain m_drivetrain;
    private boolean completed = false;

    public DriveToggle(Drivetrain subsystem) {
        m_drivetrain = subsystem;
        addRequirements(m_drivetrain);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        m_drivetrain.toggleSingleStick();
        completed = true;
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return completed;
    }

    @Override
    public boolean runsWhenDisabled() {
        return false;
    }
}
