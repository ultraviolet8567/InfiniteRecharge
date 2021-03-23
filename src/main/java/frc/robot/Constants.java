package frc.robot;

public class Constants {
    
    public static class MotorSpeeds {

        // All values are in the range [-1.0, 1.0]
        // All constants should be declared globally (i.e. public static)
        
        public static double feeder = 0.9;

        // Shooter motor speeds in red zone
        public static double red_top = 1.0;
        public static double red_bottom = 0.768;

        // Shooter motor speeds in blue zone
        public static double blue_top = 1.0;
        public static double blue_bottom = 0.725;

        // Shooter motor speeds in yellow zone
        public static double yellow_top = 1.0;
        public static double yellow_bottom = 0.8;

        // Shooter motor speeds in green zone
        public static double green_top = 0.43;
        public static double green_bottom = 0.43;
    }

}

