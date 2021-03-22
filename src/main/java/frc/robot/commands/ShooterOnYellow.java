package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.MotorSpeeds;
import frc.robot.subsystems.Shooter;

public class ShooterOnYellow extends CommandBase {

    private final Shooter m_shooter;
    private double yellow_top = MotorSpeeds.yellow_top;
    private double yellow_bottom = MotorSpeeds.yellow_bottom;
    
    public ShooterOnYellow(Shooter subsystem) {
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
        m_shooter.runTopMotor(yellow_top);
        m_shooter.runBottomMotor(yellow_bottom);
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
