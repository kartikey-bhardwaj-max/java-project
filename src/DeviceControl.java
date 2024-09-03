import java.util.Objects;
public class DeviceControl{
    public static void turnOnAirCon(Room room) {
        room.setAirConStatus(true);
        room.setAirConTemperature(25); // default temperature when turn on the air-conditioner
        System.out.println("Air conditioner in " + room.getName() + " is turned on");
    }

    public static void turnOffAirCon(Room room) {
        room.setAirConStatus(false);
        room.setAirConTemperature(0);
        System.out.println("Air conditioner in " + room.getName() + " is turned off");
    }

    public static void setAirConTemperature(Room room, int temperature) {
        room.setAirConTemperature(temperature);
        System.out.println("Air conditioner temperature in " + room.getName() + " is set to " + temperature);
    }

    public static void turnOnLED(Room room) {
        room.setLEDStatus(true);
        System.out.println("LED in " + room.getName() + " is turned on");
    }

    public static void turnOffLED(Room room) {
        room.setLEDStatus(false);
        System.out.println("LED in " + room.getName() + " is turned off");
    }

    public static void returnDeviceStatus(Room room) {
        System.out.println("Air-conditioner status: " + room.getAirConStatus());
        System.out.println("LED light status: " + room.getLEDStatus());
        System.out.println("Air-conditioner temperature: " + room.getAirConTemperature());
    }
}

