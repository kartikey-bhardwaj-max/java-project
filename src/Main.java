import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Devices devices = new Devices();
        Room room1 = devices.getRoom1();
        Room room2 = devices.getRoom2();
        int choice;
        int roomChoice;
        int temperature;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Room 1");
            System.out.println("2. Room 2");
            System.out.println("3. Quit");
            roomChoice = scanner.nextInt();
            if (roomChoice == 3) {
                break;
            }

            Room selectedRoom;
            if (roomChoice == 1) {
                selectedRoom = room1;
            } else if (roomChoice == 2) {
                selectedRoom = room2;
            } else {
                System.out.println("Please enter a valid input!");
                continue;
            }

            System.out.println("1. Turn on air conditioning");
            System.out.println("2. Turn off air conditioning");
            System.out.println("3. Set air conditioning temperature");
            System.out.println("4. Turn on LED light");
            System.out.println("5. Turn off LED light");
            System.out.println("6. Devices Status Dashboard");
            System.out.print("Select action: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    DeviceControl.turnOnAirCon(selectedRoom);
                    break;
                case 2:
                    DeviceControl.turnOffAirCon(selectedRoom);
                    break;
                case 3:
                    System.out.print("Enter temperature: ");
                    temperature = scanner.nextInt();
                    DeviceControl.setAirConTemperature(selectedRoom, temperature);
                    break;
                case 4:
                    DeviceControl.turnOnLED(selectedRoom);
                    break;
                case 5:
                    DeviceControl.turnOffLED(selectedRoom);
                    break;
                case 6:
                    DeviceControl.returnDeviceStatus(selectedRoom);
                    break;
            }
        }
        scanner.close();
    }
}
