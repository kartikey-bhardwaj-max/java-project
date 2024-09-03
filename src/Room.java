import java.util.Objects;
class Room {
    private String name;
    private boolean airConStatus;
    private int airConTemperature;
    private boolean LEDStatus;

    public Room(String name) {
        this.name = name;
        this.airConStatus = false;
        this.airConTemperature = 0;
        this.LEDStatus = false;
    }

    public String getName() {
        return this.name;
    }

    public boolean getAirConStatus() {
        return this.airConStatus;
    }

    public int getAirConTemperature() {
        return this.airConTemperature;
    }

    public boolean getLEDStatus() {
        return this.LEDStatus;
    }

    public void setAirConStatus(boolean status) {
        this.airConStatus = status;
    }

    public void setAirConTemperature(int temperature) {
        this.airConTemperature = temperature;
    }

    public void setLEDStatus(boolean status) {
        this.LEDStatus = status;
    }
}

class Devices {
    private Room room1;
    private Room room2;

    public Devices() {
        this.room1 = new Room("Room 1");
        this.room2 = new Room("Room 2");
    }

    public Room getRoom1() {
        return this.room1;
    }

    public Room getRoom2() {
        return this.room2;
    }
}
