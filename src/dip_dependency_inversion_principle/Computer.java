package src.dip_dependency_inversion_principle;

import java.util.ArrayList;

public class Computer {
    ArrayList<Device> devices;

    public Computer() {
        devices = new ArrayList<>();
    }

    public void setDevices(Device device) {
        devices.add(device);
    }

    public void useAllDevices() {
        for (Device device : devices) {
            device.use();
        }
    }
}
