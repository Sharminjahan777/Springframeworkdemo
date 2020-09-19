package aint.electronics;

public class Device {
    public int deviceMonitorSize;
    public int deviceRamSize;

   public Device(){}
   public Device(int deviceMonitorSize, int deviceRamSize){
       this.deviceMonitorSize= deviceMonitorSize;
       this.deviceRamSize= deviceRamSize;
   }

    public int getDeviceMonitorSize() {
        return deviceMonitorSize;
    }

    public void setDeviceMonitorSize(int deviceMonitorSize) {
        this.deviceMonitorSize = deviceMonitorSize;
    }

    public int getDeviceRamSize() {
        return deviceRamSize;
    }

    public void setDeviceRamSize(int deviceRamSize) {
        this.deviceRamSize = deviceRamSize;
    }

}
