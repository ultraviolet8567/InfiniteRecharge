package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.*;
import frc.robot.subsystems.*;

// The structure of the robot (including subsystems, commands, and button mappings) should be declared here.
public class RobotContainer {

  private static RobotContainer m_robotContainer = new RobotContainer();

  // The robot's subsystems
  private final Shooter m_shooter = new Shooter();
  private final Feeder m_feeder = new Feeder();
  private final Drivetrain m_drivetrain = new Drivetrain();

  // Joysticks
  private final XboxController xboxController = new XboxController(0);

  // A chooser for autonomous commands
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  // The container for the robot.  Contains subsystems, OI devices, and commands.
  private RobotContainer() {
    // SmartDashboard Buttons
    SmartDashboard.putData("Drive", new Drive(m_drivetrain));
    SmartDashboard.putData("FeederOn", new FeederOn(m_feeder));
    SmartDashboard.putData("ShooterOnGreen", new ShooterOnGreen(m_shooter));
    SmartDashboard.putData("ShooterOnYellow", new ShooterOnYellow(m_shooter));
    SmartDashboard.putData("ShooterOnBlue", new ShooterOnBlue(m_shooter));
    SmartDashboard.putData("ShooterOnRed", new ShooterOnRed(m_shooter));
    SmartDashboard.putData("ShooterOff", new ShooterOff(m_shooter));
    SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
    SmartDashboard.putData("DriveToggle", new DriveToggle(m_drivetrain));

    // Configure the button bindings
    configureButtonBindings();

    // Configure default commands
    m_drivetrain.setDefaultCommand(new Drive(m_drivetrain));

    // Configure autonomous sendable chooser
    m_chooser.setDefaultOption("Autonomous Command", new AutonomousCommand());

    SmartDashboard.putData("Auto Mode", m_chooser);
  }

  public static RobotContainer getInstance() {
    return m_robotContainer;
  }

  private void configureButtonBindings() {
    // Create some buttons
    final JoystickButton back_DriveToggle = new JoystickButton(xboxController, XboxController.Button.kBack.value);        
    back_DriveToggle.whenPressed(new DriveToggle(m_drivetrain), true);
        
    final JoystickButton bumperRight_FeederOn = new JoystickButton(xboxController, XboxController.Button.kBumperRight.value);        
    bumperRight_FeederOn.whileHeld(new FeederOn(m_feeder), true);

    final JoystickButton bumperLeft_ShooterOff = new JoystickButton(xboxController, XboxController.Button.kBumperLeft.value);        
    bumperLeft_ShooterOff.whenPressed(new ShooterOff(m_shooter), true);

    final JoystickButton b_ShooterOnRed = new JoystickButton(xboxController, XboxController.Button.kB.value);        
    b_ShooterOnRed.whenPressed(new ShooterOnRed(m_shooter), true);

    final JoystickButton x_ShooterOnBlue = new JoystickButton(xboxController, XboxController.Button.kX.value);        
    x_ShooterOnBlue.whenPressed(new ShooterOnBlue(m_shooter), true);

    final JoystickButton y_ShooterOnYellow = new JoystickButton(xboxController, XboxController.Button.kY.value);        
    y_ShooterOnYellow.whenPressed(new ShooterOnYellow(m_shooter), true);

    final JoystickButton a_ShooterOnGreen = new JoystickButton(xboxController, XboxController.Button.kA.value);        
    a_ShooterOnGreen.whenPressed(new ShooterOnGreen(m_shooter), true);
  }

  public XboxController getXboxController() {
    return xboxController;
  }

  // Passes the autonomous command to the Main class
  public Command getAutonomousCommand() {
    // The selected command will be run in autonomous
    return m_chooser.getSelected();
  }
}
