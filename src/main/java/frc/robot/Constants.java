package frc.robot;

/*
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */

public class Constants {
    
    public static class MotorSpeeds {

        // All values are in the range [-1.0, 1.0]
        
        public static double feeder = 0.9;

        // Shooter motor speeds in red zone
        public static double red_top = 0.7;
        public static double red_bottom = 0.7;

        // Shooter motor speeds in blue zone
        public static double blue_top = 0.6;
        public static double blue_bottom = 0.6;

        // Shooter motor speeds in yellow zone
        public static double yellow_top = 0.5;
        public static double yellow_bottom = 0.5;

        // Shooter motor speeds in green zone
        public static double green_top = 0.4;
        public static double green_bottom = 0.4;
    }

}

