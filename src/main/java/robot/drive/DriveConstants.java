package robot.drive;


public class DriveConstants{
    public static final double WHEEL_RADIUS = 0.08;
    public static final double CIRCUMFERENCE = 2.0 * Math.PI * WHEEL_RADIUS;
    public static final double GEARING = 8.0;
    public static final double POSITION_FACTOR = CIRCUMFERENCE * GEARING;
    public static final double VELOCITY_FACTOR = CIRCUMFERENCE * GEARING / 60.0;

    leftEncoder.setPositionConversionFactor(DriveConstants.POSITION_FACTOR);
    rightEncoder.setPositionConversionFactor(DriveConstants.POSITION_FACTOR);
    leftEncoder.setVelocityConversionFactor(DriveConstants.VELOCITY_FACTOR);
    rightEncoder.setVelocityConversionFactor(DriveConstants.VELOCITY_FACTOR);

    leftEncoder.setPosition(0);
    rightEncoder.setPosition(0);


}
