package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    
    private PWMSparkMax leftFrontMotor;
    private PWMSparkMax leftRearMotor;
    private SpeedControllerGroup leftControllerGroup;
    private PWMSparkMax rightFrontMotor;
    private PWMSparkMax rightRearMotor;
    private SpeedControllerGroup rightControllerGroup;
    private DifferentialDrive differentialDrive;
    private boolean m_singleStickOperation = true;
    
    public Drivetrain() {
        leftFrontMotor = new PWMSparkMax(6);
        addChild("LeftFrontMotor", leftFrontMotor);
        leftFrontMotor.setInverted(false);

        leftRearMotor = new PWMSparkMax(8);
        addChild("LeftRearMotor", leftRearMotor);
        leftRearMotor.setInverted(false);

        leftControllerGroup = new SpeedControllerGroup(leftFrontMotor, leftRearMotor);
        addChild("LeftControllerGroup", leftControllerGroup);
        

        rightFrontMotor = new PWMSparkMax(7);
        addChild("RightFrontMotor", rightFrontMotor);
        rightFrontMotor.setInverted(false);

        rightRearMotor = new PWMSparkMax(9);
        addChild("RightRearMotor", rightRearMotor);
        rightRearMotor.setInverted(false);

        rightControllerGroup = new SpeedControllerGroup(rightFrontMotor, rightRearMotor);
        addChild("RightControllerGroup", rightControllerGroup);
        

        differentialDrive = new DifferentialDrive(leftControllerGroup, rightControllerGroup);
        addChild("Differential Drive", differentialDrive);
        differentialDrive.setSafetyEnabled(true);
        differentialDrive.setExpiration(0.1);
        differentialDrive.setMaxOutput(0.5);
    }

    // This method will be called once per scheduler run
    @Override
    public void periodic() {
        SmartDashboard.putNumber("Motor Speed: Left Front", leftFrontMotor.get());
        SmartDashboard.putNumber("Motor Speed: Right Front", rightFrontMotor.get());
        SmartDashboard.putNumber("Motor Speed: Left Back", leftRearMotor.get());
        SmartDashboard.putNumber("Motor Speed: Right Back", rightRearMotor.get());
        SmartDashboard.putString("Drive Setting", m_singleStickOperation ? "Single Stick" : "Split Control");
    }

    @Override
    public void simulationPeriodic() {
    }
    
    public DifferentialDrive getDifferentialDrive() {
        return differentialDrive;
    }

    public boolean isSingleStickDrive() {
        return m_singleStickOperation;
    }

    public void toggleSingleStick() {
        m_singleStickOperation = !m_singleStickOperation;
    }
}

